import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = Arrays.stream(sc.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
        int numToUse = sc.nextInt();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        numbers.forEach(num -> {
            int key = Math.abs(numToUse - num);
            map.computeIfAbsent(key, ArrayList::new);
            map.get(key).add(num);
        });

        int minIndex = map.keySet()
                .stream()
                .min(Integer::compareTo)
                .orElse(0);
        System.out.println(
                map.get(minIndex)
                        .stream()
                        .sorted()
                        .map(Object::toString)
                        .collect(Collectors.joining(" "))
        );
    }
}
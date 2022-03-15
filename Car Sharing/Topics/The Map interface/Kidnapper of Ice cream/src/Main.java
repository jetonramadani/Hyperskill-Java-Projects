import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        Map<String, Long> map =
                Arrays.stream(sc.nextLine()
                                .split("\\s+"))
                        .collect(Collectors
                                .groupingBy(Function.identity(), Collectors.counting()));
        Arrays.stream(sc.nextLine().split("\\s+"))
                .forEach(
                        ele -> map.compute(ele, (k, v) -> v == null ? -1 : v - 1)
                );
        System.out.println(map.values()
                .stream()
                .anyMatch(v -> v < 0) ? "You are busted" : "You get money");
    }
}
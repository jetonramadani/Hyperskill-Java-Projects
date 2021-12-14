import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 2 + 1);
        map.put("four", 2 + 2);
        map.put("five", 2 + 2 + 1);
        map.put("six", 2 + 2 + 2);
        map.put("seven", 2 + 2 + 2 + 1);
        map.put("eight", 2 + 2 + 2 + 2);
        map.put("nine", 2 + 2 + 2 + 2 + 1);
        String num = scanner.next();
        System.out.println(map.get(num));
    }
}
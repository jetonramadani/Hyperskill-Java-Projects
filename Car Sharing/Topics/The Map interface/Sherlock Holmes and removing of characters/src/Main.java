import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static Integer compute(Character key, Integer val) {
        return val + 1;
    }

    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        char[] first = sc.nextLine().toLowerCase().toCharArray();
        char[] second = sc.nextLine().toLowerCase().toCharArray();
        HashMap<Character, Integer> res = new HashMap<>();

        for (char ch : first) {
            res.computeIfPresent(ch, Main::compute);
            res.putIfAbsent(ch, 1);
        }
        for (char ch : second) {
            res.computeIfPresent(ch, (k, v) -> v - 1);
            res.putIfAbsent(ch, -1);
        }

        System.out.println(Math.abs(res
                .values()
                .stream()
                .mapToInt(Math::abs)
                .sum()));

    }
}
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int lines = sc.nextInt();

        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < lines; i++) {
            int key = sc.nextInt();
            String val = sc.next();
            if (key >= start && key <= end) {
                map.put(key, val);
            }
        }

        map.forEach((key, val) -> System.out.printf("%d %s%n", key, val));

    }
}
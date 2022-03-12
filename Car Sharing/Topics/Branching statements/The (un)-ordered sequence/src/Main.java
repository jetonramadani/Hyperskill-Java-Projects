import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int prev = scanner.nextInt();
        boolean okay = true;
        int curr = scanner.nextInt();

        while (curr != 0 && curr == prev) {
            prev = curr;
            curr = scanner.nextInt();
        }
        boolean increasing = prev < curr;

        while (curr != 0 && okay) {
            okay = prev <= curr && increasing || prev >= curr && !increasing;
            prev = curr;
            curr = scanner.nextInt();
        }

        System.out.println(okay);

    }
}
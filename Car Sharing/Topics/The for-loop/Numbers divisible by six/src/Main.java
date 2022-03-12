import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int sum = 0;
        int n = scanner.nextInt();
        final int six = 6;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();

            if (num % six == 0) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
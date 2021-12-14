import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int max = Integer.MIN_VALUE;
        int n = scanner.nextInt();
        final int four = 4;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % four == 0) {
                max = Integer.max(max, num);
            }
        }
        System.out.println(max);
    }
}
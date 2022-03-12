import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int count = 0;
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int divisible = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            if (i % divisible == 0) {
                ++count;
            }
        }
        System.out.println(count);
    }
}
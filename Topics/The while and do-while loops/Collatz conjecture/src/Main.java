import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num = scanner.nextInt();
        final int two = 2;
        final int one = 1;

        while (num != 1) {
            System.out.print(num + " ");
            if (num % two == one) {
                num = num * (two + one) + one;
            } else {
                num /= 2;
            }
        }
        System.out.println(1);
    }
}
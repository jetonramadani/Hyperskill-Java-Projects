import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        final int zero = 0;
        int count = 0;

        while (scanner.nextInt() != zero) {
            ++count;
        }

        System.out.println(count);
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        final int three = 3;
        final int five = 5;
        for (; start <= end; start++) {
            if (start % three == 0) {
                System.out.print("Fizz");
            }
            if (start % five == 0) {
                System.out.print("Buzz");
            }
            if (start % five != 0 && start % three != 0) {
                System.out.print(start);
            }
            System.out.println();
        }
    }
}
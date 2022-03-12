import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int busHeight = scanner.nextInt();
        int n = scanner.nextInt();
        int i = 1;
        for (; i <= n; i++) {
            if (busHeight >= scanner.nextInt()) {
                System.out.println("Will crash on bridge " + i);
                break;
            }
        }
        if (i > n) {
            System.out.println("Will not crash");
        }
    }
}

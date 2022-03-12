import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int globalCounter = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
                ++globalCounter;
                if (globalCounter == n) {
                    break;
                }
            }
            if (globalCounter == n) {
                break;
            }
        }
    }
}
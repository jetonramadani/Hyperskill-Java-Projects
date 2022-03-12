import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            System.out.println(num % 2 == 0 ? "even" : "odd");
        }
    }
}
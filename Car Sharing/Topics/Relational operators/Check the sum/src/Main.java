import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        final int twenty = 20;
        System.out.println(first + second == twenty
            || second + third == twenty
            || first + third == twenty
        );
    }
}
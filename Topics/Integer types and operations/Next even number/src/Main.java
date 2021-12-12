import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num = scanner.nextInt();
        final int two = 2;
        System.out.println(num + two - num % two);
    }
}
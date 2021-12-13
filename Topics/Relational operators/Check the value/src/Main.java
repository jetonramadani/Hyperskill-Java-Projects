import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num = scanner.nextInt();
        final int ten = 10;
        final int zero = 0;

        System.out.println(num > zero && num < ten);
    }
}
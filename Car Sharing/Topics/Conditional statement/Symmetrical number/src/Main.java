import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String num = scanner.next();
        String reverse = new StringBuilder(num).reverse().toString();
        final int thousand = 1000;
        if (num.equals(reverse)) {
            System.out.println(1);
        }  else {
            System.out.println((int) (Math.random() * thousand));
        }
    }
}
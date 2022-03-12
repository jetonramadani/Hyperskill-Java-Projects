import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        final int four = 4;
        final int hundred = 100;
        int year = scanner.nextInt();
        if (year % (four * hundred) == 0 || year % four == 0 && year % hundred != 0) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }

    }
}
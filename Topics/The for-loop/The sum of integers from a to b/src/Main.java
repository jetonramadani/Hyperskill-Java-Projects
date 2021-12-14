import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        final int one = 1;
        int upperSum = end * (end + one) / 2;
        int downSum = start * (start - one) / 2;

        System.out.println(upperSum - downSum);
    }
}
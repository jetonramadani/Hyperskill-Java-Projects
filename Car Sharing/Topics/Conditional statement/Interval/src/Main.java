import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num = scanner.nextInt();
        final int a = -15;
        final int b = 12;
        final int c = 14;
        final int d = 17;
        final int e = 19;
        final boolean firstInterval = num > a && num <= b;
        final boolean secondInterval = num > c && num < d;
        final boolean lastInterval = num >= e;
        if (firstInterval || secondInterval  || lastInterval) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
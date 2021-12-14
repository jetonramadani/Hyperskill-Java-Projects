import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();

        int fives = 0;
        int fours = 0;
        int threes = 0;
        int twos = 0;

        final int five = 5;
        final int four = 4;
        final int three = 3;
        final int two = 2;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            switch (num) {
                case five:
                    ++fives;
                    break;
                case four:
                    ++fours;
                    break;
                case three:
                    ++threes;
                    break;
                case two:
                    ++twos;
                    break;
                default:
                    break;
            }
        }
        System.out.printf("%d %d %d %d", twos, threes, fours, fives);
    }
}
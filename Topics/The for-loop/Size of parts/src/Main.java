import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        final int one = 1;
        final int zero = 0;
        int larger = 0;
        int smaller = 0;
        int perfect = 0;
        for (int i = 0; i < n; i++) {
            switch (scanner.nextInt()) {
                case one:
                    ++larger;
                    break;
                case -one:
                    ++smaller;
                    break;
                case zero:
                    ++perfect;
                    break;
                default:
                    break;
            }
        }
        System.out.printf("%d %d %d", perfect, larger, smaller);
    }
}
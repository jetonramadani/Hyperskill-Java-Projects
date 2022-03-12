import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        double m = scanner.nextDouble();
        final double percent = 1 + scanner.nextInt() / 100.;
        int k = scanner.nextInt();
        int years = 0;
        while (m < k) {
            m *= percent;
            ++years;
        }
        System.out.println(years);
    }
}
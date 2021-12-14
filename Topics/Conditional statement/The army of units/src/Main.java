import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        final int less = 1;
        final int pack = 19;
        final int throng = 249;
        final int zounds = 999;
        int army = scanner.nextInt();

        if (army < less) {
            System.out.println("no army");
        } else if (army <= pack) {
            System.out.println("pack");
        } else if (army <= throng) {
            System.out.println("throng");
        } else if (army <= zounds) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}
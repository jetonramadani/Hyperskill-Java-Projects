import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        final int thousand = 1000;
        int count = 0;
        final int three = 3;

        for (int i = 0; i < thousand; i++) {
            double res = i * i * i * a + i * i * b + i * c + d;
            if (res == 0) {
                System.out.println(i);
                ++count;
            }
            if (count == three) {
                break;
            }
        }
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        final int four = 4;
        int max = Integer.MIN_VALUE;
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num % four == 0 && max < num) {
                max = num;
            }
        }
        System.out.println(max);
    }
}
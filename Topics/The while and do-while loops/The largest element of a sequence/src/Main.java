import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int max = Integer.MIN_VALUE;
        int num = scanner.nextInt();
        while (num != 0) {
            if (max < num) {
                max = num;
            }
            num = scanner.nextInt();
        }
        System.out.println(max);
    }
}
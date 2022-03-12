import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        final int ten = 10;
        final int num = scanner.nextInt();
        final int sum = num / (ten * ten) + num / ten % ten + num % ten;
        System.out.println(sum);
    }
}
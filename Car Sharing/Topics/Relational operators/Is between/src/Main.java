import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        if (second > third) {
            int temp = second;
            second = third;
            third = temp;
        }
        boolean between = first >= second && first <= third;
        System.out.println(between);
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        boolean firstPos = first > 0 && second <= 0 && third <= 0;
        boolean secondPos = first <= 0 && second > 0 && third <= 0;
        boolean thirdPos = first <= 0 && second <= 0 && third > 0;
        System.out.println(firstPos || secondPos || thirdPos);

    }
}
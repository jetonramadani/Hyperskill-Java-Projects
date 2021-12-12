import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int people;
        people = scanner.nextInt();
        int first = people / 2 + people % 2;
        people = scanner.nextInt();
        int second = people / 2 + people % 2;
        people = scanner.nextInt();
        int third = people / 2 + people % 2;
        System.out.println(first + second + third);
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        long num = scanner.nextLong();
        long fact = 1;
        int count = 2;
        while (fact <= num) {
            fact *= count++;
        }
        System.out.println(--count);
    }
}
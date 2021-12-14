import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int i = 1;
        int max = scanner.nextInt();
        while (i * i <= max) {
            System.out.println(i * i);
            i++;
        }
    }
}
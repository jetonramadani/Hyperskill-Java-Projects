import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Integer.parseInt(new StringBuilder(scanner.next()).reverse().toString()));
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String inp = sc.nextLine();
        String line = sc.nextLine();
        String reverse = new StringBuilder(line).reverse().toString();

        System.out.println(inp.contains(line) || inp.contains(reverse));
    }
}
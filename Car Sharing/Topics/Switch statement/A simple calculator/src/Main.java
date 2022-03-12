import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        long num = scanner.nextLong();
        String sign = scanner.next();
        long num2 = scanner.nextLong();

        switch (sign) {
            case "+":
                System.out.println(num + num2);
                break;
            case "-":
                System.out.println(num - num2);
                break;
            case "*":
                System.out.println(num * num2);
                break;
            case "/":
                System.out.println(num2 != 0 ? num / num2 : "Division by 0!");
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}
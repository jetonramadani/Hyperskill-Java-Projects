import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String shape = scanner.next();
        double a = scanner.nextInt();
        int b;
        int c;
        final double pi = 3.14;
        switch (shape) {
            case "triangle":
                b = scanner.nextInt();
                c = scanner.nextInt();
                double s = (a + b + c) / 2;
                System.out.println(Math.sqrt(s * (s - a) * (s - b) * (s - c)));
                break;
            case "circle":
                System.out.println(a * a * pi);
                break;
            case "rectangle":
                b = scanner.nextInt();
                System.out.println(a * b);
                break;
            default:
                break;
        }
    }
}
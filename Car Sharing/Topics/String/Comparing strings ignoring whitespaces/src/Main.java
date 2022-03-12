import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String str = scanner.nextLine();
        String str1 = scanner.nextLine();
        System.out.println(str.replaceAll("\\s+", "")
                .equals(str1.replaceAll("\\s+", "")));
    }
}
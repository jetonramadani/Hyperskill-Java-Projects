import java.util.Objects;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        final int ten = 10;
        while (true) {
            String line = sc.nextLine();
            if (Objects.equals(line, "0")) {
                break;
            }
            try {
                int parsedNum = Integer.parseInt(line);
                System.out.println(parsedNum * ten);
            } catch (NumberFormatException e) {
                System.out.println("Invalid user input: " + line);
            }
        }
    }
}
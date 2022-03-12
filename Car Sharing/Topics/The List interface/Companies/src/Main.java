import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        System.out.println(List.of(
                new Scanner(System.in)
                        .nextLine()
                        .split("\\s+")
        ));
    }
}
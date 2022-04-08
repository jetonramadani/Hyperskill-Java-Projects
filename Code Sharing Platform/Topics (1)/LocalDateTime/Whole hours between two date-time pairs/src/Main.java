import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        LocalDateTime first = LocalDateTime.parse(sc.nextLine());
        LocalDateTime second = LocalDateTime.parse(sc.nextLine());
        System.out.println(first.until(second, ChronoUnit.HOURS));
    }
}
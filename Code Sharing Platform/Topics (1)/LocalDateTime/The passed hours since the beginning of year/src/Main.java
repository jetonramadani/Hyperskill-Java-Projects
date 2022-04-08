import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        LocalDateTime date = LocalDateTime.parse(sc.nextLine());
        LocalDateTime firstDayOfYear = LocalDateTime.of(date.getYear(), 1, 1, 0, 0);

        System.out.println(firstDayOfYear.until(date, ChronoUnit.HOURS));
    }
}
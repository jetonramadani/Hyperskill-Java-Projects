import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        LocalDateTime dateTime = LocalDateTime.parse(sc.next());
        int days = Integer.parseInt(sc.next());
        int hours = Integer.parseInt(sc.next());

        System.out.println(dateTime.plusDays(days).minusHours(hours));
    }
}
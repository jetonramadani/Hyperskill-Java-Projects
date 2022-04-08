import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        LocalDateTime dateTime = LocalDateTime.parse(sc.nextLine());
        int minutesToAdd = Integer.parseInt(sc.nextLine());
        dateTime = dateTime.plusMinutes(minutesToAdd);
        System.out.printf("%d %d %s%n", dateTime.getYear(),
                dateTime.getDayOfYear(),
                dateTime.toLocalTime());
    }
}
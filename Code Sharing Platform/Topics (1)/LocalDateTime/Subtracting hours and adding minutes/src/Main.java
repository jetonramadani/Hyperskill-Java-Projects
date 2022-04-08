import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        LocalDateTime date = LocalDateTime.parse(sc.nextLine());
        int hours = Integer.parseInt(sc.next());
        int minutes = Integer.parseInt(sc.next());

        System.out.println(date.minusHours(hours).plusMinutes(minutes));
    }
}
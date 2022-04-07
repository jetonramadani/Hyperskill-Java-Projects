import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        LocalDate date = LocalDate.of(year, month, 1);
        while (date.getDayOfWeek().getValue() != 1) {
            date = date.plusDays(1);
        }
        while (date.getMonthValue() == month) {
            System.out.println(date);
            date = date.plusDays(7);
        }
    }
}
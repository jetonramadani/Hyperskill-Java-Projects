import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        LocalDate date = LocalDate.ofYearDay(sc.nextInt(), sc.nextInt());

        System.out.println(date.getMonthValue() != date.plusDays(1).getMonthValue());
    }
}
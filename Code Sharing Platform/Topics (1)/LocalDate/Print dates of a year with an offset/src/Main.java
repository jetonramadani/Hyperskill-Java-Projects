import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        LocalDate date = LocalDate.parse(sc.nextLine());
        int plusDays = Integer.parseInt(sc.nextLine());
        int startingYear = date.getYear();
        while (startingYear == date.getYear()) {
            System.out.println(date);
            date = date.plusDays(plusDays);
        }
    }
}
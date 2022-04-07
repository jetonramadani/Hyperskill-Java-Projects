import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String strDate = sc.nextLine();
        LocalDate date = LocalDate.parse(strDate);
        System.out.printf("%d %s", date.getDayOfYear(), date.getDayOfMonth());
    }
}
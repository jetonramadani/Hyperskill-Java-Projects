import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int day1 = sc.nextInt();
        int day2 = sc.nextInt();
        int day3 = sc.nextInt();
        System.out.println(LocalDate.ofYearDay(year, day1));
        System.out.println(LocalDate.ofYearDay(year, day2));
        System.out.println(LocalDate.ofYearDay(year, day3));
    }
}
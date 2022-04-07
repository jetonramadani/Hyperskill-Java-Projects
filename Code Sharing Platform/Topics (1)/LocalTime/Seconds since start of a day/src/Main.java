import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        long sec = sc.nextLong();
        LocalTime time = LocalTime.ofSecondOfDay(sec);
        System.out.println(time);
    }
}
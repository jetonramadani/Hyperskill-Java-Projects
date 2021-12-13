import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int people = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();
        final int ten = 10;
        final int five = 5;
        boolean weekendParty = weekend && people >= ten + five && people <= ten + ten + five;
        boolean nonWeekend = !weekend && people >= ten && people <= ten + ten;
        System.out.println(weekendParty || nonWeekend);
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int durationDays = scanner.nextInt();
        int foodCostDaily = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int nightCost = scanner.nextInt();
        int nightCount = durationDays - 1;
        int twoWayCost = 2 * flightCost;
        int total = durationDays * foodCostDaily + twoWayCost +
                nightCost * nightCount;
        System.out.println(total);
    }
}
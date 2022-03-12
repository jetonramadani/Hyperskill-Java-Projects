import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        final int firstHourSeconds = scanner.nextInt() * 3600;
        final int firstMinSeconds = scanner.nextInt() * 60;
        int firstSeconds = scanner.nextInt() + firstHourSeconds + firstMinSeconds;
        final int secondHourSeconds = scanner.nextInt() * 3600;
        final int secondMinSeconds = scanner.nextInt() * 60;
        int secondSeconds = scanner.nextInt() + secondHourSeconds + secondMinSeconds;
        int totalSecDif = secondSeconds - firstSeconds;
        System.out.println(totalSecDif);
    }
}
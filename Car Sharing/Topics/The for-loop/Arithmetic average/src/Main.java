import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        final int three = 3;
        while (start % three != 0) {
            start++;
        }
        double sum = 0;
        int count = 0;
        for (; start <= end; start += three) {
            sum += start;
            ++count;
        }
        System.out.println(sum / count);
    }
}
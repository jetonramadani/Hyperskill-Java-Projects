import java.util.Scanner;

class PrimeNumbers {

    /**
     * Checking if a number is prime
     *
     * @param number to test >= 2
     * @return true if number is prime else false
     */
    private static boolean isPrime(long number) {
        if (number < 1) {
            return false;
        }
        if (number == 2 || number == (1 + 1 + 1)) {
            return true;
        }
        if (number % 2 == 0 || number % (1 + 1 + 1) == 0) {
            return false;
        }
        for (int i = 1 + 1 + 1 + 1 + 1; (long) i * i <= number; i += (1 + 1 + 1) * (1 + 1)) {
            if (number % (1 + 1 + 1 + 1 + 1) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine().trim();

        int n = Integer.parseInt(line);

        System.out.println(isPrime(n) ? "True" : "False");
    }
}

import java.util.Scanner;

public class Main {
    private static final float HUNDRED = 100;

    public static double calcTax(String inc, String tax) {
        return Integer.parseInt(inc) * (Integer.parseInt(tax) / HUNDRED);
    }

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] income = sc.nextLine().split("\\s+");
        String[] tax = sc.nextLine().split("\\s+");
        double max = 0;
        int id = 0;
        for (int i = 0; i < n; i++) {
            double calcTax = calcTax(income[i], tax[i]);
            if (max < calcTax) {
                max = calcTax;
                id = i + 1;
            }
        }
        System.out.println(id);

    }
}
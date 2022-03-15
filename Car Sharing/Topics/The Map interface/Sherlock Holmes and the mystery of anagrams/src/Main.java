import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        char[] first = sc.nextLine().toLowerCase().toCharArray();
        char[] second = sc.nextLine().toLowerCase().toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        System.out.println(Arrays.equals(first, second) ? "yes" : "no");
    }
}
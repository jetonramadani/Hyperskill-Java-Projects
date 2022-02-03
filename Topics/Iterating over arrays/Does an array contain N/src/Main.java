import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String[] start = sc.nextLine().split("\\s+");

        String str = sc.nextLine();

        System.out.println(Arrays.asList(start).contains(str));
    }
}
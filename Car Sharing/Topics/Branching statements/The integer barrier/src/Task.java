// write your answer here 

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        final int thousand = 1000;
        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
            if (sum >= thousand) {
                sum -= thousand;
                break;
            }
        }
        System.out.println(sum);
    }
}

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n - 1; i++) {
            nums[i + 1] = scanner.nextInt();
        }
        nums[0] = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
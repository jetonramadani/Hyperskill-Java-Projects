import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] nums = scanner.nextLine().split("\\s+");
        int shift = scanner.nextInt() % nums.length;

        for (int i = nums.length - shift; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        for (int i = 0; i < nums.length - shift; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
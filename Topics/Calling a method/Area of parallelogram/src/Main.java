import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // call the method here
        Scanner sc = new Scanner(System.in);

        int base = sc.nextInt();
        int height = sc.nextInt();

        countAreaOfParallelogram(base, height);
    }

    // Do not change code below   
    public static void countAreaOfParallelogram(int b, int h) {
        System.out.println(b * h);
    }
}
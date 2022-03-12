import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        final int ten = 10;
        final int two = 2;
        final int five = 5;
        int[] numbers = {ten + 2, ten + five + 2, ten - 2,
                            ten * ten + 1, ten * (two + 1) + two + 1}; // initialize the array

        System.out.println(Arrays.toString(numbers));
    }
}
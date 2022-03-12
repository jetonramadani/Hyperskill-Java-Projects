import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        final long num = 100_000_000_000L;

        long[] longNumbers = {num + 1, num + 1 + 1, num + 1 + 1 + 1};

        System.out.println(Arrays.toString(longNumbers));
    }
}

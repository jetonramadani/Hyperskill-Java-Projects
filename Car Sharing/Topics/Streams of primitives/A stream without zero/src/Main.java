import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

class StreamOfPrimitives {

    public static LongStream getLongStream(int n) {
        // write your code here
        return LongStream.concat(LongStream.range(n * -1, 0), LongStream.rangeClosed(1, n));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String result = getLongStream(n).mapToObj(e -> e)
                .map(Object::toString)
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}
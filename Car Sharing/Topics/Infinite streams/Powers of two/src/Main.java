import java.util.stream.*;

class StreamUtils {

    public static Stream<Integer> generateStreamWithPowersOfTwo(int n) {
        return Stream.iterate(1, i -> i * 2)
                .limit(n);
    }
}
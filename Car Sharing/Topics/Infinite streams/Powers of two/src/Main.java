import java.util.stream.Stream;

class StreamUtils {

    public static Stream<Integer> generateStreamWithPowersOfTwo(int n) {
        return Stream.iterate(1, i -> i * 2)
                .limit(n);
    }
}
import java.util.function.LongBinaryOperator;
import java.util.stream.LongStream;


class Operator {
    public static LongBinaryOperator binaryOperator = (start, end) ->
            LongStream.rangeClosed(start, end).reduce(1, (l, r) -> l * r);
}
import java.util.function.IntBinaryOperator;

class Operator {

    public static IntBinaryOperator binaryOperator = (l, r) -> l > r ? l : r;
}
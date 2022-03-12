import java.util.function.LongUnaryOperator;

class Operator {

    public static LongUnaryOperator unaryOperator = num -> num + 2 - num % 2;
}
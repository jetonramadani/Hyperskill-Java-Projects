class Predicate {
    public static final TernaryIntPredicate ALL_DIFFERENT = (i1, i2, i3) ->
            i1 != i2 && i2 != i3 && i1 != i3;

    @FunctionalInterface
    public interface TernaryIntPredicate {
        // Write a method here
        boolean test(int i1, int i2, int i3);
    }
}
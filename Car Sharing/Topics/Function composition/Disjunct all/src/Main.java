import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

class CombiningPredicates {

    /**
     * The method represents a disjunct operator for a list of predicates.
     * For an empty list it returns the always false predicate.
     * <p>
     * if (predicates.size() == 0) {
     * return n -> false; // write your code here
     * }
     * IntPredicate res = predicates.get(0);
     * for (int i = 1; i < predicates.size(); i++) {
     * res = res.or(predicates.get(i));
     * }
     * return res;
     */
    public static IntPredicate disjunctAll(List<IntPredicate> predicates) {

        return predicates
                .stream()
                .reduce(n -> false, IntPredicate::or);
    }

    // Don't change the code below
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split(" ");

        List<Boolean> values = Arrays.stream(strings)
                .map(Boolean::parseBoolean)
                .collect(Collectors.toList());

        List<IntPredicate> predicates = new ArrayList<>();
        values.forEach(v -> predicates.add(x -> v));

        System.out.println(disjunctAll(predicates).test(0));
    }
}
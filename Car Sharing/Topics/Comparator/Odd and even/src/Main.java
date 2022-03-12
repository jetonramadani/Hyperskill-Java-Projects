import java.util.List;
import java.util.stream.Collectors;

class Utils {
    public static int compare(Integer i1, Integer i2) {
        final int module21 = Math.abs(i1 % 2);
        final int module22 = Math.abs(i2 % 2);
        return module21 == module22 ?
                module21 == 0 ?
                        Integer.compare(i1, i2) * -1
                        : Integer.compare(i1, i2)
                : module21 == 0 ? 1 : -1;
    }

    public static List<Integer> sortOddEven(List<Integer> numbers) {
        return numbers
                .stream()
                .sorted(Utils::compare)
                .collect(Collectors.toList());
    }
}
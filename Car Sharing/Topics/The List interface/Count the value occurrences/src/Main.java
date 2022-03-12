import java.util.List;
import java.util.stream.Collectors;

class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        // implement the method
        List<Integer> first = list1
                .stream()
                .filter(ele -> ele == elem)
                .collect(Collectors.toList());
        List<Integer> second = list2
                .stream()
                .filter(ele -> ele == elem)
                .collect(Collectors.toList());
        return first.equals(second);
    }
}
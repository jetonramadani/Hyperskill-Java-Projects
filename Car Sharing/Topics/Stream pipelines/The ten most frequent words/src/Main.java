import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int ten = 10;

        String str = sc.nextLine()
                .replaceAll("\\p{Punct}", "");
        Map<String, Long> res = Arrays.stream(str.split("\\s+"))
                .map(String::toLowerCase)
                .collect(Collectors
                        .groupingBy(Function.identity(),
                                Collectors.counting()));
        res.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder())
                        .thenComparing(Map.Entry.comparingByKey()))
                .limit(ten)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
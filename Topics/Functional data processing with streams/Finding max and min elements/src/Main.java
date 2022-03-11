import java.util.*;
import java.util.function.*;
import java.util.stream.*;


class MinMax {

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> res = stream
                .sorted(order)
                .collect(Collectors.toList());
        if (res.isEmpty()) {
            minMaxConsumer.accept(null, null);
        } else {
            T min = res.get(0);
            T max = res.get(res.size() - 1);
            minMaxConsumer.accept(min, max);
        }
    }
}
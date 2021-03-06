import java.util.*;

class MapUtils {
    public static Map<Integer, String> getSubMap(TreeMap<Integer, String> map) {
        // Write your code here
        final int four = 4;
        int firstKey = map.firstKey();
        int lastKey = map.lastKey();
        TreeMap<Integer, String> res = new TreeMap<>(Collections.reverseOrder());
        if (firstKey % 2 != 0) {
            res.putAll(map.subMap(firstKey, firstKey + four + 1));
        } else {
            res.putAll(map.subMap(lastKey - four, lastKey + 1));
        }
        return res;
    }
}

/* Do not modify code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<Integer, String> map = new TreeMap<>();
        Arrays.stream(scanner.nextLine().split("\\s")).forEach(s -> {
            String[] pair = s.split(":");
            map.put(Integer.parseInt(pair[0]), pair[1]);
        });

        Map<Integer, String> res = MapUtils.getSubMap(map);
        res.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        final int three = 3;
        map.put("Gamma", three);
        map.put("Omega", three * three * three - three);
        map.put("Alpha", 1);

        // write your code here
        map.forEach((k, v) -> System.out.printf("%s=%d%n", k, v));
    }
}
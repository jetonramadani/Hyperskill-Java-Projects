import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        // write your code here
        TreeMap<String, Integer> map = new TreeMap<>() {
            {
                put("Alpha", 1);
                put("Gamma", 1 + 1 + 1);
                put("Omega", ((1 + 1) * (1 + 1)) * ((1 + 1) * (1 + 1)) + (1 + 1 + 1 + 1) * (1 + 1));
            }
        };
        System.out.println(map);
    }
}
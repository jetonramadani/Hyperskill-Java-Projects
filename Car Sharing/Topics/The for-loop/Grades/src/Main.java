import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        HashMap<String, Integer> grades = new HashMap<>() {
            {
                put("D", 0);
                put("C", 0);
                put("B", 0);
                put("A", 0);
            }
        };
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String grade = scanner.nextLine();
            grades.computeIfPresent(grade, (s, integer) -> integer + 1);
        }
        List<String> res = grades
                .values()
                .stream()
                .mapToInt(Integer::intValue)
                .mapToObj(Integer::toString)
                .collect(Collectors.toList());
        Collections.reverse(res);
        System.out.println(String.join(" ", res));

    }
}
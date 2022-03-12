import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static String getLongest(String l, String r) {
        return l.length() < r.length() ? r : l;
    }

    static void changeList(List<String> list) {
        // write your code here
        String str = list
                .stream()
                .reduce("", Main::getLongest);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, str);
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        final int len = 3;
        for (int i = 0; i < len; i++) {
            list.add(scanner.next());
        }
        Collections.reverse(list);
        list.forEach(System.out::println);
        // start coding here
    }
}

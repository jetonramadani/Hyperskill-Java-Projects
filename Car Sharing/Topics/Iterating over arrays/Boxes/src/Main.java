import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        final int length = 3;
        Scanner sc = new Scanner(System.in);
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            first.add(sc.nextInt());
        }
        for (int i = 0; i < length; i++) {
            second.add(sc.nextInt());
        }
        Collections.sort(first);
        Collections.sort(second);
        if (first.get(0) < second.get(0)
                && first.get(1) < second.get(1)
                && first.get(2) < second.get(2)) {
            System.out.println("Box 1 < Box 2");
        } else if (first.get(0) > second.get(0)
                && first.get(1) > second.get(1)
                && first.get(2) > second.get(2)) {
            System.out.println("Box 1 > Box 2");
        } else {
            System.out.println("Incompatible");
        }
    }
}
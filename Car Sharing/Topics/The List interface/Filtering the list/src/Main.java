import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

class Main {

    public static void main(String[] args) {
        AtomicInteger ati = new AtomicInteger(0);
        // put your code here
        System.out.println(
                Arrays.stream(new Scanner(System.in)
                                .nextLine()
                                .split("\\s+"))
                        .filter(val -> {
                            int res = ati.getAndIncrement();
                            return res % 2 != 0;
                        })
                        .collect(ArrayList<String>::new,
                                (list, e) -> list.add(0, e),
                                (list1, list2) -> list1.addAll(0, list2))
                        .stream()
                        .collect(Collectors.joining(" "))

        );
    }
}
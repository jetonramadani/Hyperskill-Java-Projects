import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        List<String> strings = new ArrayList<>(Arrays.asList(sc.nextLine().split("\\s+")));

        String str = sc.nextLine();

        System.out.println(strings.stream()
                .filter(item -> item.equals(str)).count());
    }
}
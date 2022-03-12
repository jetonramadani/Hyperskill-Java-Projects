import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Test {
    private boolean okay;

    Test() {
        this.okay = true;
    }

    public void check(Integer i1, Integer i2) {
        this.okay = this.okay && i1.compareTo(i2) < 0;
    }

    public boolean isOkay() {
        return okay;
    }
}

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        List<Integer> integers = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());
        Test test = new Test();
        IntStream.range(0, integers.size() - 1)
                .forEach(i -> test.check(integers.get(i), integers.get(i + 1)));
        System.out.println(test.isOkay());
    }
}
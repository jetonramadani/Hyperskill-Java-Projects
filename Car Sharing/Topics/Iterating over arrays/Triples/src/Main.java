import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Test {
    private int num;

    Test(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void increase() {
        this.num++;
    }
}

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        List<Integer> integers = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                // .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
                .boxed()
                .collect(Collectors.toList());
        Test test = new Test(0);
        IntStream.range(0, integers.size() - 2)
                .forEach(i -> {
                    if (integers.get(i) + 1 == integers.get(i + 1)
                            && integers.get(i + 1) + 1 == integers.get(i + 2)) {
                        test.increase();
                    }
                });
        System.out.println(test.getNum());
    }
}
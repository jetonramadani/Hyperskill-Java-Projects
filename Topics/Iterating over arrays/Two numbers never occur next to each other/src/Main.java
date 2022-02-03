import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String str = sc.nextLine();
        String find = sc.nextLine();
        String findReverse = new StringBuilder(find).reverse().toString();

        System.out.println(!str.contains(find) && !str.contains(findReverse));


    }
}

/*

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Test {
    private int max;
    private int curr;

    Test() {
        this.max = 1;
        this.curr = 1;
    }

    public void increase() {
        this.curr++;
    }

    public void reset() {
        this.max = Math.max(this.curr, this.max);
        this.curr = 1;
    }

    public int getMax() {
        return max;
    }
}

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        List<Integer> str = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());
        Test test = new Test();
        IntStream.range(0, str.size() - 1)
                .forEach(i -> {
                    if (str.get(i) < str.get(i + 1)) {
                        test.increase();
                    } else {
                        test.reset();
                    }
                });
        test.reset();
        System.out.println(test.getMax());

    }
}

 */
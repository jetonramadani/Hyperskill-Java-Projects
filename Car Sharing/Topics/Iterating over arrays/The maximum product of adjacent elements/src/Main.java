import java.util.Arrays;
import java.util.Scanner;

class Test {
    private int last;

    public Test(int last) {
        this.last = last;
    }

    public int getLast() {
        return last;
    }

    public void setLast(int last) {
        this.last = last;
    }
}

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        Test test = new Test(1);
        System.out.println(Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .mapToLong(n -> {
                    int last = test.getLast();
                    test.setLast(n);
                    return (long) n * last;
                })
                .reduce(Math::max)
                .orElse(0));
    }
}
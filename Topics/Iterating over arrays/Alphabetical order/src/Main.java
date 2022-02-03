import java.util.Scanner;
import java.util.stream.IntStream;

class Test {
    private boolean res;

    Test() {
        this.res = true;
    }

    public boolean isRes() {
        return res;
    }

    public void setRes(boolean res) {
        this.res = this.res && res;
    }
}

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        String[] str = sc.nextLine().split("\\s+");

        Test test = new Test();
        IntStream.range(0, str.length - 1)
                .forEach(i -> test.setRes(str[i].compareTo(str[i + 1]) <= 0));

        System.out.println(test.isRes());
    }
}
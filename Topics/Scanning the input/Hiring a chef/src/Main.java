import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String name = scanner.next();
        String years = scanner.next();
        String fusion = scanner.next();

        System.out.printf("The form for %s is completed. " +
                        "We will contact you if we need a chef who cooks %s " +
                        "dishes and has %s years of experience.\n",
                name, fusion, years);
    }
}
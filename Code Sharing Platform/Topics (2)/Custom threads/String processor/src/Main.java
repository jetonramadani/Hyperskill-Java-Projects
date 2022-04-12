import java.util.Scanner;

class StringProcessor extends Thread {

    final Scanner scanner = new Scanner(System.in); // use it to read string from the standard input

    @Override
    public void run() {
        // implement this method
        boolean okay = true;
        while (okay) {
            okay = false;
            String str = scanner.nextLine();
            for (char ch : str.toCharArray()) {
                if (Character.isLowerCase(ch)) {
                    System.out.println(str.toUpperCase());
                    okay = true;
                    break;
                }
            }
        }
        System.out.println("FINISHED");
    }
}
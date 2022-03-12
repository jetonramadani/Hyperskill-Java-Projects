import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int firstRow = scanner.nextInt();
        int firstCol = scanner.nextInt();
        int secondRow = scanner.nextInt();
        int secondCol = scanner.nextInt();
        boolean sameRowOrCol = firstRow == secondRow || firstCol == secondCol;
        boolean diagonal = Math.abs(firstRow - secondRow) == Math.abs(firstCol - secondCol);
        boolean attack = sameRowOrCol || diagonal;
        if (attack) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
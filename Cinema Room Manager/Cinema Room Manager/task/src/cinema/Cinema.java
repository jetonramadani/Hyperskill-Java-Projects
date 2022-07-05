package cinema;

import java.util.Scanner;

public class Cinema {
    private static Scanner scanner = new Scanner(System.in);

    private static class Cino {
        private final char[][] seats;
        private final int rows;
        private final int seatsPerRow;

        public Cino() {
            System.out.println("Enter the number of rows:");
            this.rows = scanner.nextInt();
            System.out.println("Enter the number of seats in each row:");
            this.seatsPerRow = scanner.nextInt();
            seats = new char[rows][seatsPerRow];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < seatsPerRow; j++) {
                    seats[i][j] = 'S';
                }
            }
        }

        public void printTotal() {
            System.out.println("Total income:");
            int income = 0;
            if (rows * seatsPerRow <= 60) {
                income = rows * seatsPerRow * 10;
            } else {
                int firstHalf = Math.floorDiv(rows, 2);
                int secondHalf = rows - firstHalf;
                income += firstHalf * seatsPerRow * 10;
                income += secondHalf * seatsPerRow * 8;
            }
            System.out.printf("$%d", income);
        }

        public void printCino() {
            // Write your code here
            System.out.printf("Cinema:%n ");
            for (int i = 1; i <= this.rows; i++) {
                System.out.printf(" %d", i);
            }
            for (int i = 0; i < this.rows; i++) {
                System.out.printf("%n%d", i + 1);
                for (int j = 0; j < this.seatsPerRow; j++) {
                    System.out.printf(" %c", this.seats[i][j]);
                }
            }
        }
    }


    public static void main(String[] args) {
        Cino cinema = new Cino();
        cinema.printTotal();
    }
}
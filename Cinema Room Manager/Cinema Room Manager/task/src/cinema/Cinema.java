package cinema;

import java.util.Scanner;

public class Cinema {
    private static Scanner scanner = new Scanner(System.in);

    private static class Cino {
        private final char[][] seats;
        private final int rows;
        private final int seatsPerRow;
        private final boolean isAll10USD;
        private final int firstHalf;

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
            this.isAll10USD = this.rows * this.seatsPerRow <= 60;
            this.firstHalf = Math.floorDiv(this.rows, 2);
        }

        public void printTotal() {
            System.out.println("Total income:");
            int income = 0;
            if (isAll10USD) {
                income = this.rows * this.seatsPerRow * 10;
            } else {
                int secondHalf = this.rows - this.firstHalf;
                income += this.firstHalf * this.seatsPerRow * 10;
                income += secondHalf * this.seatsPerRow * 8;
            }
            System.out.printf("$%d%n", income);
        }

        public void bookSeat() {
            System.out.println("Enter a row number:");
            int seatRow = scanner.nextInt();
            System.out.println("Enter a seat number in that row:");
            int seatColumn = scanner.nextInt();
            seats[seatRow - 1][seatColumn - 1] = 'B';
            int price = 0;
            if (isAll10USD) {
                price = 10;
            } else {
                price = seatRow <= firstHalf ? 10 : 8;
            }
            System.out.printf("Ticket price: $%d%n", price);
        }

        public void printCino() {
            // Write your code here
            System.out.printf("Cinema:%n ");
            for (int i = 1; i <= this.seatsPerRow; i++) {
                System.out.printf(" %d", i);
            }
            for (int i = 0; i < this.rows; i++) {
                System.out.printf("%n%d", i + 1);
                for (int j = 0; j < this.seatsPerRow; j++) {
                    System.out.printf(" %c", this.seats[i][j]);
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Cino cinema = new Cino();
        cinema.printCino();
        cinema.bookSeat();
        cinema.printCino();
    }
}
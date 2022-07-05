package cinema;

public class Cinema {

    public static void main(String[] args) {
        // Write your code here
        char[][] seats = {
                {'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S'},
                {'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S'},
                {'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S'},
                {'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S'},
                {'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S'},
                {'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S'},
                {'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S'}
        };
        System.out.printf("Cinema:%n ");
        for (int i = 1; i <= seats[0].length; i++) {
            System.out.printf(" %d", i);
        }
        for (int i = 0; i < seats.length; i++) {
            System.out.printf("%n%d", i + 1);
            for (int j = 0; j < seats[i].length; j++) {
                System.out.printf(" %c", seats[i][j]);
            }
        }
    }
}
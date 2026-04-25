import java.util.Random;

public class TicTacToeUC2 {

    public static void main(String[] args) {

        // Create Random object
        Random random = new Random();

        // Generate toss (0 or 1)
        int toss = random.nextInt(2);

        // Game state variables
        char player1Symbol;
        char player2Symbol;
        int currentPlayer;

        // Decide who starts
        if (toss == 0) {
            currentPlayer = 1;
            player1Symbol = 'X';
            player2Symbol = 'O';

            System.out.println("Player 1 starts and is assigned X");
            System.out.println("Player 2 is assigned O");

        } else {
            currentPlayer = 2;
            player1Symbol = 'O';
            player2Symbol = 'X';

            System.out.println("Player 2 starts and is assigned X");
            System.out.println("Player 1 is assigned O");
        }
    }
}
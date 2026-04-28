import java.util.Random;

public class TicTacToe {
    // Game State Variables
    static char playerSymbol;
    static char computerSymbol;
    static String currentPlayer;

    public static void main(String[] args) {
        char[][] board = new char[3][3];
        
        // UC1 Logic
        initializeBoard(board);
        
        // UC2 Logic: Perform the toss
        performToss();
        
        // Display initial status
        displayBoard(board);
        System.out.println("Toss Result: " + currentPlayer + " goes first as '" + 
                           (currentPlayer.equals("User") ? playerSymbol : computerSymbol) + "'");
    }

    /**
     * UC2: Randomly decides the first player and assigns symbols.
     */
    public static void performToss() {
        Random rand = new Random();
        // Generates 0 or 1
        int toss = rand.nextInt(2); 

        if (toss == 0) {
            currentPlayer = "User";
            playerSymbol = 'X';
            computerSymbol = 'O';
        } else {
            currentPlayer = "Computer";
            computerSymbol = 'X';
            playerSymbol = 'O';
        }
    }

    // --- UC1 Methods ---
    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) board[i][j] = '-';
        }
    }

    public static void displayBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) System.out.print(board[i][j] + " ");
            System.out.println();
        }
    }
}
import java.util.Random;

public class TicTacToe {
    static Random rand = new Random();

    public static void main(String[] args) {
        char[][] board = new char[3][3];
        initializeBoard(board);
        
        // Simulating the Computer's Turn
        System.out.println("Computer is thinking...");
        computerMove(board, 'O');
        
        displayBoard(board);
    }

    /**
     * UC7: Computer picks a random slot (1-9) until it finds a valid one.
     */
    public static void computerMove(char[][] board, char symbol) {
        boolean moved = false;

        while (!moved) {
            // Generate random slot between 1 and 9
            int slot = rand.nextInt(9) + 1;
            
            // UC4: Convert to indices
            int row = (slot - 1) / 3;
            int col = (slot - 1) % 3;

            // UC5: Validate
            if (isValidMove(board, row, col)) {
                // UC6: Place move
                placeMove(board, row, col, symbol);
                System.out.println("Computer placed '" + symbol + "' in slot " + slot);
                moved = true; // Exit the loop
            }
        }
    }

    // --- Reusing Methods from Previous UCs ---
    public static boolean isValidMove(char[][] board, int row, int col) {
        return board[row][col] == '-';
    }

    public static void placeMove(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

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

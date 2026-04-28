public class TicTacToe {
    
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        initializeBoard(board);

        // Simulated Scenario: User wants to play 'X' at Slot 5
        int slot = 5;
        char symbol = 'X';

        // 1. Convert (UC4)
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        // 2. Validate (UC5)
        if (isValidMove(board, row, col)) {
            // 3. Place Move (UC6)
            placeMove(board, row, col, symbol);
            System.out.println("Move placed successfully!");
        }

        displayBoard(board);
    }

    /**
     * UC6: Updates the board array at the specific row and column.
     * This method assumes validation has already been performed.
     */
    public static void placeMove(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // --- Supporting Methods (Simplified for UC6) ---
    public static boolean isValidMove(char[][] board, int row, int col) {
        return board[row][col] == '-';
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
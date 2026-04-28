public class TicTacToe {
    // ... existing variables (playerSymbol, currentPlayer, etc.)

    public static void main(String[] args) {
        char[][] board = new char[3][3];
        // Assume UC1-UC3 logic has run and we have a 'slot'
        int slot = 5; // Example input

        // UC4 Logic: Convert and Place
        convertToIndicesAndPlace(board, slot, 'X');
        
        displayBoard(board);
    }

    /**
     * UC4: Maps 1-9 to [row][col] and updates the board.
     */
    public static void convertToIndicesAndPlace(char[][] board, int slot, char symbol) {
        // Step 1: Adjust to 0-based indexing (1-9 becomes 0-8)
        int adjustedSlot = slot - 1;

        // Step 2: Calculate Row and Column
        int row = adjustedSlot / 3;
        int col = adjustedSlot % 3;

        System.out.println("Mapping slot " + slot + " to Board[" + row + "][" + col + "]");
        
        // Update the board at the calculated position
        board[row][col] = symbol;
    }

    // --- UC1: Display Logic ---
    public static void displayBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) System.out.print(board[i][j] + " ");
            System.out.println();
        }
    }
}
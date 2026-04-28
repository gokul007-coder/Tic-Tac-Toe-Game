public class TicTacToe {
    
    public static void main(String[] args) {
        char[][] board = {
            {'-', 'X', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };

        // Example: Validating a move at Row 0, Col 1 (Already occupied by 'X')
        int row = 0;
        int col = 1;

        if (isValidMove(board, row, col)) {
            board[row][col] = 'O';
            System.out.println("Move accepted!");
        } else {
            System.out.println("Invalid move! The cell is either out of bounds or already taken.");
        }
    }

    /**
     * UC5: Validates if the move is within bounds and the cell is empty.
     * @return true if the move is valid, false otherwise.
     */
    public static boolean isValidMove(char[][] board, int row, int col) {
        // 1. Check Boundary: Indices must be between 0 and 2
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // 2. Check Availability: Cell must contain the initialization character '-'
        if (board[row][col] != '-') {
            return false;
        }

        // If both checks pass, the move is valid
        return true;
    }
}
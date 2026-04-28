public class TicTacToe {

    /**
     * UC10: Checks if the board is completely full.
     * Usually called after isWin() returns false.
     * @return true if no '-' characters remain, false otherwise.
     */
    public static boolean isDraw(char[][] board) {
        // Iterate through every row
        for (int i = 0; i < 3; i++) {
            // Iterate through every column in that row
            for (int j = 0; j < 3; j++) {
                // If even one cell is still '-', it's not a draw yet
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        // If the loops complete without finding a '-', the board is full
        return true;
    }
}
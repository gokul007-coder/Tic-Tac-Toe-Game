public class TicTacToe {

    /**
     * UC9: Checks all possible winning combinations.
     * @return true if a win is detected, false otherwise.
     */
    public static boolean isWin(char[][] board) {
        // 1. Check Rows and Columns
        for (int i = 0; i < 3; i++) {
            // Horizontal Win (Row i)
            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }
            // Vertical Win (Column i)
            if (board[0][i] != '-' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return true;
            }
        }

        // 2. Check Diagonals
        // Top-Left to Bottom-Right
        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true;
        }
        // Top-Right to Bottom-Left
        if (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true;
        }

        return false;
    }
}
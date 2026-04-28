public class tictok_uc1 {
    public static void main(String[] args) {
        // 1. Create a 3x3 character array
acToe        char[][] board = new char[3][3];

        // 2. Initialize the board with '-'
        initializeBoard(board);

        // 3. Print the board to the console
        displayBoard(board);
    }

    /**
     * Fills the 2D array with '-' to represent empty cells.
     */
    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    /**
     * Prints the board with clear formatting.
     */
    public static void displayBoard(char[][] board) {
        System.out.println("Current Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
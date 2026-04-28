public class TicTacToe {
    static String currentPlayer;
    static boolean gameRunning = true;

    public static void main(String[] args) {
        char[][] board = new char[3][3];
        initializeBoard(board);
        performToss(); // Sets the initial currentPlayer

        // UC8: The Continuous Game Loop
        while (gameRunning) {
            displayBoard(board);
            System.out.println("\nIt is " + currentPlayer + "'s turn.");

            if (currentPlayer.equals("User")) {
                handleUserTurn(board);
            } else {
                handleComputerTurn(board);
            }

            // Check for game-ending conditions
            if (isWin(board)) {
                displayBoard(board);
                System.out.println("Congratulations! " + currentPlayer + " wins!");
                gameRunning = false;
            } else if (isDraw(board)) {
                displayBoard(board);
                System.out.println("It's a draw!");
                gameRunning = false;
            } else {
                // No win or draw? Switch turns and continue
                switchTurn();
            }
        }
    }

    /**
     * UC8: Swaps the current player identity.
     */
    public static void switchTurn() {
        currentPlayer = (currentPlayer.equals("User")) ? "Computer" : "User";
    }

    // --- Placeholder logic for Win/Draw (to be fully implemented in UC9/10) ---
    public static boolean isWin(char[][] board) { return false; }
    public static boolean isDraw(char[][] board) { return false; }

    // --- Turn Handlers (UC3-UC7 logic combined) ---
    public static void handleUserTurn(char[][] board) {
        // Logic to get input, convert, validate, and place move
    }

    public static void handleComputerTurn(char[][] board) {
        // Logic to generate random move and place it
    }
}
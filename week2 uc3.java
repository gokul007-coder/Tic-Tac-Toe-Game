import java.util.Scanner;
import java.util.Random;

public class TicTacToe {
    static char playerSymbol;
    static char computerSymbol;
    static String currentPlayer;
    
    // Create a single Scanner instance for the whole class
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        char[][] board = new char[3][3];
        initializeBoard(board);
        performToss();
        displayBoard(board);

        // UC3 Logic: Accept user input if it's the user's turn
        if (currentPlayer.equals("User")) {
            int slot = getUserInput();
            System.out.println("You chose slot: " + slot);
        }
    }

    /**
     * UC3: Reads a slot number from the user.
     * @return The integer entered by the user.
     */
    public static int getUserInput() {
        System.out.print("Enter a slot (1-9) to place your move: ");
        int slot = scanner.nextInt();
        return slot;
    }

    // --- UC2: Toss Logic ---
    public static void performToss() {
        Random rand = new Random();
        if (rand.nextInt(2) == 0) {
            currentPlayer = "User";
            playerSymbol = 'X';
        } else {
            currentPlayer = "Computer";
            playerSymbol = 'O';
        }
    }

    // --- UC1: Board Logic ---
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
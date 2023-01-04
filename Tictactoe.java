import java.util.Scanner;

// Tik Tac Toe game class

public class Tictactoe {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char[][] board = new char[3][3];
        int row, col;
        boolean player1 = true;
        boolean player2 = false;
        boolean win = false;
        boolean draw = false;
        int count = 0;

        // Initialize the board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }

        // Display the board
        System.out.println("Welcome to Tic Tac Toe");
        System.out.println("Player 1 is X and Player 2 is O");
        System.out.println("Enter a row (0, 1, or 2) for player 1: ");
        row = kb.nextInt();
        System.out.println("Enter a column (0, 1, or 2) for player 1: ");
        col = kb.nextInt();

        while (win == false && draw == false) {
            if (player1 == true) {
                board[row][col] = 'X';
                player1 = false;
                player2 = true;
            } else if (player2 == true) {
                board[row][col] = 'O';
                player1 = true;
                player2 = false;
            }

            // Display the board
            for (int i = 0; i < 3; i++) {
                System.out.println("-------------");
                for (int j = 0; j < 3; j++) {
                    System.out.print("| " + board[i][j] + " ");
                }
                System.out.println("|");
            }
            System.out.println("-------------");

            // Check if player 1 wins
            if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') {
                win = true;
                System.out.println("Player 1 wins!");
            } else if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') {
                win = true;
                System.out.println("Player 1 wins!");
            } else if (
                board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X'
            ) {
                win = true;
                System.out.println("Player 1 wins!");
            } else if (
                board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X'
            ) {
                win = true;
                System.out.println("Player 1 wins!");
            } else if (
                board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X'
            ) {
                win = true;
                System.out.println("Player 1 wins!");
            } else if (
                board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X'
            ) {
                win = true;
                System.out.println("Player 1 wins!");
            } else if (
                board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X'
            ) {
                win = true;
                System.out.println("Player 1 wins!");
            } else if (
                board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X'
            ) {
                win = true;
                System.out.println("Player 1 wins!");
            } 
            // Check if player 2 wins
            else if (
                board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O'
            ) {
                win = true;
                System.out.println("Player 2 wins!");
            } else if (
                board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O'
            ) {
                win = true;
                System.out.println("Player 2 wins!");
            } else if (
                board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O'
            ) {
                win = true;
                System.out.println("Player 2 wins!");
            } else if (
                board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O'
            ) {
                win = true;
                System.out.println("Player 2 wins!");
            } else if (
                board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O'
            ) {
                win = true;
                System.out.println("Player 2 wins!");
            } else if (
                board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O'
            ) {
                win = true;
                System.out.println("Player 2 wins!");
            } else if (
                board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O'
            ) {
                win = true;
                System.out.println("Player 2 wins!");
            } else if (
                board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O'
            ) {
                win = true;
                System.out.println("Player 2 wins!");
            } else if (count == 9) {
                draw = true;
                System.out.println("It's a draw!");
            }

            if (win == false && draw == false) {
                if (player1 == true) {
                    System.out.println("Enter a row (0, 1, or 2) for player 1: ");
                    row = kb.nextInt();
                    System.out.println("Enter a column (0, 1, or 2) for player 1: ");
                    col = kb.nextInt();
                } else if (player2 == true) {
                    System.out.println("Enter a row (0, 1, or 2) for player 2: ");
                    row = kb.nextInt();
                    System.out.println("Enter a column (0, 1, or 2) for player 2: ");
                    col = kb.nextInt();
                }
                count++;
            }

            // reset the board
                
        }
        kb.close();
    }
}

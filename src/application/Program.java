package application;

import java.util.Scanner;

import entities.Board;
import entities.WinCheck;

public class Program {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		WinCheck winCheck = new WinCheck();
		String[][] board = new String[3][3];
		Board boardx = new Board();
//board1	

		boardx.printBoard(board);

//*Player 1 turn	
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("        PLAYER 1");

		System.out.print("Choose line: ");
		int line1 = read.nextInt();
		System.out.print("Choose column: ");
		int column1 = read.nextInt();

		while (line1 < 0 || line1 > 2 || column1 < 0 || column1 > 2) {
			System.out.println();
			System.out.println("Invalid position, choose from 0-2.");
			System.out.print("Choose line: ");
			line1 = read.nextInt();
			System.out.print("Choose column: ");
			column1 = read.nextInt();
		}
		board[line1][column1] = "X";

//board2
		boardx.printBoardTurns(board);
//**Player 2 turn
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("        PLAYER 2");

		System.out.print("Choose line: ");
		read.nextLine();
		int line2 = read.nextInt();
		System.out.print("Choose column: ");
		int column2 = read.nextInt();

		while (line2 < 0 || line2 > 2 || column2 < 0 || column2 > 2) {
			System.out.println();
			System.out.println("Invalid position, choose from 0-2.");
			System.out.print("Choose line: ");
			line2 = read.nextInt();
			System.out.print("Choose column: ");
			column2 = read.nextInt();
		}
		while (board[line2][column2] != null) {
			System.out.println("Invalid choice, please choose another.");
			System.out.println();
			System.out.print("Choose line: ");
			line2 = read.nextInt();
			System.out.print("Choose column: ");
			column2 = read.nextInt();
		}
		board[line2][column2] = "O";

//board3
		boardx.printBoardTurns(board);
//*Player 1 turn _________________________________________
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("        PLAYER 1");

		System.out.print("Choose line: ");
		read.nextLine();
		int line3 = read.nextInt();
		System.out.print("Choose column: ");
		int column3 = read.nextInt();

		while (line3 < 0 || line3 > 2 || column3 < 0 || column3 > 2) {
			System.out.println();
			System.out.println("Invalid position, choose from 0-2.");
			System.out.print("Choose line: ");
			line3 = read.nextInt();
			System.out.print("Choose column: ");
			column3 = read.nextInt();
		}
		while (board[line3][column3] != null) {
			System.out.println("Invalid choice, please choose another.");
			System.out.println();
			System.out.print("Choose line: ");
			line3 = read.nextInt();
			System.out.print("Choose column: ");
			column3 = read.nextInt();
		}
		board[line3][column3] = "X";
// board4
		boardx.printBoardTurns(board);

//**Player 2 turn
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("        PLAYER 2");

		System.out.print("Choose line: ");
		read.nextLine();
		int line4 = read.nextInt();
		System.out.print("Choose column: ");
		int column4 = read.nextInt();

		while (line4 < 0 || line4 > 2 || column4 < 0 || column4 > 2) {
			System.out.println();
			System.out.println("Invalid position, choose from 0-2.");
			System.out.print("Choose line: ");
			line4 = read.nextInt();
			System.out.print("Choose column: ");
			column4 = read.nextInt();
		}
		while (board[line4][column4] != null) {
			System.out.println("Invalid choice, please choose another.");
			System.out.println();
			System.out.print("Choose line: ");
			line4 = read.nextInt();
			System.out.print("Choose column: ");
			column4 = read.nextInt();
		}
		board[line4][column4] = "O";

//board5
		boardx.printBoardTurns(board);
		System.out.println();
		winCheck.checkWinY(board);
		winCheck.checkWinX(board);

//*Player 1 turn _________________________________________
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("        PLAYER 1");

		System.out.print("Choose line: ");
		read.nextLine();
		int line5 = read.nextInt();
		System.out.print("Choose column: ");
		int column5 = read.nextInt();

		while (line5 < 0 || line5 > 2 || column5 < 0 || column5 > 2) {
			System.out.println();
			System.out.println("Invalid position, choose from 0-2.");
			System.out.print("Choose line: ");
			line5 = read.nextInt();
			System.out.print("Choose column: ");
			column5 = read.nextInt();
		}
		while (board[line5][column5] != null) {
			System.out.println("Invalid choice, please choose another.");
			System.out.println();
			System.out.print("Choose line: ");
			line5 = read.nextInt();
			System.out.print("Choose column: ");
			column5 = read.nextInt();
		}
		board[line5][column5] = "X";

// board6
		boardx.printBoardTurns(board);
		System.out.println();
		winCheck.checkWinY(board);
		winCheck.checkWinX(board);

// **Player 2 turn
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("        PLAYER 2");

		System.out.print("Choose line: ");
		read.nextLine();
		int line6 = read.nextInt();
		System.out.print("Choose column: ");
		int column6 = read.nextInt();

		while (line6 < 0 || line6 > 2 || column6 < 0 || column6 > 2) {
			System.out.println();
			System.out.println("Invalid position, choose from 0-2.");
			System.out.print("Choose line: ");
			line6 = read.nextInt();
			System.out.print("Choose column: ");
			column6 = read.nextInt();
		}
		while (board[line6][column6] != null) {
			System.out.println("Invalid choice, please choose another.");
			System.out.println();
			System.out.print("Choose line: ");
			line6 = read.nextInt();
			System.out.print("Choose column: ");
			column6 = read.nextInt();
		}
		board[line6][column6] = "O";

// board7
		boardx.printBoardTurns(board);
		System.out.println();
		winCheck.checkWinY(board);
		winCheck.checkWinX(board);

// *Player 1 turn _________________________________________
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("        PLAYER 1");

		System.out.print("Choose line: ");
		read.nextLine();
		int line7 = read.nextInt();
		System.out.print("Choose column: ");
		int column7 = read.nextInt();

		while (line7 < 0 || line7 > 2 || column7 < 0 || column7 > 2) {
			System.out.println();
			System.out.println("Invalid position, choose from 0-2.");
			System.out.print("Choose line: ");
			line7 = read.nextInt();
			System.out.print("Choose column: ");
			column7 = read.nextInt();
		}
		while (board[line7][column7] != null) {
			System.out.println("Invalid choice, please choose another.");
			System.out.println();
			System.out.print("Choose line: ");
			line7 = read.nextInt();
			System.out.print("Choose column: ");
			column7 = read.nextInt();
		}
		board[line7][column7] = "X";

// board8
		boardx.printBoardTurns(board);
		System.out.println();
		winCheck.checkWinY(board);
		winCheck.checkWinX(board);

// **Player 2 turn
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("        PLAYER 2");

		System.out.print("Choose line: ");
		read.nextLine();
		int line8 = read.nextInt();
		System.out.print("Choose column: ");
		int column8 = read.nextInt();

		while (line8 < 0 || line8 > 2 || column8 < 0 || column8 > 2) {
			System.out.println();
			System.out.println("Invalid position, choose from 0-2.");
			System.out.print("Choose line: ");
			line8 = read.nextInt();
			System.out.print("Choose column: ");
			column8 = read.nextInt();
		}
		while (board[line8][column8] != null) {
			System.out.println("Invalid choice, please choose another.");
			System.out.println();
			System.out.print("Choose line: ");
			line8 = read.nextInt();
			System.out.print("Choose column: ");
			column8 = read.nextInt();
		}
		board[line8][column8] = "O";

// board9
		boardx.printBoardTurns(board);
		System.out.println();
		winCheck.checkWinY(board);
		winCheck.checkWinX(board);
// *Player 1 turn _________________________________________
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("        PLAYER 1");

		System.out.print("Choose line: ");
		read.nextLine();
		int line9 = read.nextInt();
		System.out.print("Choose column: ");
		int column9 = read.nextInt();

		while (line9 < 0 || line9 > 2 || column9 < 0 || column9 > 2) {
			System.out.println();
			System.out.println("Invalid position, choose from 0-2.");
			System.out.print("Choose line: ");
			line9 = read.nextInt();
			System.out.print("Choose column: ");
			column9 = read.nextInt();
		}
		while (board[line9][column9] != null) {
			System.out.println("Invalid choice, please choose another.");
			System.out.println();
			System.out.print("Choose line: ");
			line9 = read.nextInt();
			System.out.print("Choose column: ");
			column9 = read.nextInt();
		}
		board[line9][column9] = "X";

// board8
		boardx.printBoardTurns(board);
		System.out.println();
		winCheck.checkWinY(board);
		winCheck.checkWinX(board);

//draw	
		System.out.println("That's a draw!");
		read.close();
	}
}

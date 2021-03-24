package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Board;
import entities.WinCheck;

public class Program {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		WinCheck winCheck = new WinCheck();
		String[][] board = new String[3][3];
		Board boardx = new Board();
//board1	_______________________________________________	

		boardx.printBoard(board);

//*Player 1 turn	_________________________________________
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("        PLAYER 1");

		try {
			System.out.print("Choose line: ");
			int line1 = read.nextInt();
			System.out.print("Choose column: ");
			int column1 = read.nextInt();
			board[line1][column1] = "X";

		} catch (InputMismatchException e) {
			System.out.println();
			System.out.println("Invalid character!");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println();
			System.out.println("Invalid character!");

		}

//board2
		boardx.printBoardTurns(board);
//**Player 2 turn
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("        PLAYER 2");

		try {
			System.out.print("Choose line: ");
			read.nextLine();
			int line2 = read.nextInt();
			System.out.print("Choose column: ");
			int column2 = read.nextInt();

			while (board[line2][column2] != null) {
				System.out.println("Invalid choice, please choose another.");
				System.out.println();
				System.out.print("Choose line: ");
				line2 = read.nextInt();
				System.out.print("Choose column: ");
				column2 = read.nextInt();
			}
			board[line2][column2] = "O";
		} catch (InputMismatchException e) {
			System.out.println();
			System.out.println("Invalid character!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println();
			System.out.println("Invalid character!");
		}

//board3
		boardx.printBoardTurns(board);
//*Player 1 turn _________________________________________
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("        PLAYER 1");

		try {
			System.out.print("Choose line: ");
			read.nextLine();
			int line3 = read.nextInt();
			System.out.print("Choose column: ");
			int column3 = read.nextInt();

			while (board[line3][column3] != null) {
				System.out.println("Invalid choice, please choose another.");
				System.out.println();
				System.out.print("Choose line: ");
				line3 = read.nextInt();
				System.out.print("Choose column: ");
				column3 = read.nextInt();
			}
			board[line3][column3] = "X";
		} catch (InputMismatchException e) {
			System.out.println();
			System.out.println("Invalid character!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println();
			System.out.println("Invalid character!");
		}

// board4
		boardx.printBoardTurns(board);

//**Player 2 turn
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("        PLAYER 2");

		try {
			System.out.print("Choose line: ");
			read.nextLine();
			int line4 = read.nextInt();
			System.out.print("Choose column: ");
			int column4 = read.nextInt();

			while (board[line4][column4] != null) {
				System.out.println("Invalid choice, please choose another.");
				System.out.println();
				System.out.print("Choose line: ");
				line4 = read.nextInt();
				System.out.print("Choose column: ");
				column4 = read.nextInt();
			}
			board[line4][column4] = "O";
		} catch (InputMismatchException e) {
			System.out.println();
			System.out.println("Invalid character!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println();
			System.out.println("Invalid character!");
		}
//board5
		boardx.printBoardTurns(board);
		System.out.println();
		winCheck.checkWinY(board);
		winCheck.checkWinX(board);

//*Player 1 turn _________________________________________
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("        PLAYER 1");

		try {
			System.out.print("Choose line: ");
			read.nextLine();
			int line5 = read.nextInt();
			System.out.print("Choose column: ");
			int column5 = read.nextInt();

			while (board[line5][column5] != null) {
				System.out.println("Invalid choice, please choose another.");
				System.out.println();
				System.out.print("Choose line: ");
				line5 = read.nextInt();
				System.out.print("Choose column: ");
				column5 = read.nextInt();
			}
			board[line5][column5] = "X";
		} catch (InputMismatchException e) {
			System.out.println();
			System.out.println("Invalid character!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println();
			System.out.println("Invalid character!");
		}
// board6
		boardx.printBoardTurns(board);
		System.out.println();
		winCheck.checkWinY(board);
		winCheck.checkWinX(board);

// **Player 2 turn
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("        PLAYER 2");

		try {
			System.out.print("Choose line: ");
			read.nextLine();
			int line6 = read.nextInt();
			System.out.print("Choose column: ");
			int column6 = read.nextInt();

			while (board[line6][column6] != null) {
				System.out.println("Invalid choice, please choose another.");
				System.out.println();
				System.out.print("Choose line: ");
				line6 = read.nextInt();
				System.out.print("Choose column: ");
				column6 = read.nextInt();
			}
			board[line6][column6] = "O";
		} catch (InputMismatchException e) {
			System.out.println();
			System.out.println("Invalid character!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println();
			System.out.println("Invalid character!");
		}
// board7
		boardx.printBoardTurns(board);
		System.out.println();
		winCheck.checkWinY(board);
		winCheck.checkWinX(board);

// *Player 1 turn _________________________________________
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("        PLAYER 1");

		try {
			System.out.print("Choose line: ");
			read.nextLine();
			int line7 = read.nextInt();
			System.out.print("Choose column: ");
			int column7 = read.nextInt();

			while (board[line7][column7] != null) {
				System.out.println("Invalid choice, please choose another.");
				System.out.println();
				System.out.print("Choose line: ");
				line7 = read.nextInt();
				System.out.print("Choose column: ");
				column7 = read.nextInt();
			}
			board[line7][column7] = "X";
		} catch (InputMismatchException e) {
			System.out.println();
			System.out.println("Invalid character!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println();
			System.out.println("Invalid character!");
		}
// board8
		boardx.printBoardTurns(board);
		System.out.println();
		winCheck.checkWinY(board);
		winCheck.checkWinX(board);

// **Player 2 turn
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("        PLAYER 2");

		try {
			System.out.print("Choose line: ");
			read.nextLine();
			int line8 = read.nextInt();
			System.out.print("Choose column: ");
			int column8 = read.nextInt();

			while (board[line8][column8] != null) {
				System.out.println("Invalid choice, please choose another.");
				System.out.println();
				System.out.print("Choose line: ");
				line8 = read.nextInt();
				System.out.print("Choose column: ");
				column8 = read.nextInt();
			}
			board[line8][column8] = "O";
		} catch (InputMismatchException e) {
			System.out.println();
			System.out.println("Invalid character!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println();
			System.out.println("Invalid character!");
		}
// board9
		boardx.printBoardTurns(board);
		System.out.println();
		winCheck.checkWinY(board);
		winCheck.checkWinX(board);
// *Player 1 turn _________________________________________
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("        PLAYER 1");

		try {
			System.out.print("Choose line: ");
			read.nextLine();
			int line9 = read.nextInt();
			System.out.print("Choose column: ");
			int column9 = read.nextInt();

			while (board[line9][column9] != null) {
				System.out.println("Invalid choice, please choose another.");
				System.out.println();
				System.out.print("Choose line: ");
				line9 = read.nextInt();
				System.out.print("Choose column: ");
				column9 = read.nextInt();
			}
			board[line9][column9] = "X";
		} catch (InputMismatchException e) {
			System.out.println();
			System.out.println("Invalid character!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println();
			System.out.println("Invalid character!");
		}

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

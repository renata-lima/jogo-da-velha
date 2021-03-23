package application;

import java.util.Scanner;

import entities.WinCheck;

public class Program {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

//board1	_______________________________________________	
		String[][] board = new String[3][3];
		WinCheck winCheck = new WinCheck();

		for (int i = 0; i < 3; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < 3; j++) {
				System.out.print("[   ]");
				System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = 0; i < 3; i++) {
			System.out.print("    " + i);
		}

//*Player 1 turn	_________________________________________
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("        PLAYER 1");

		System.out.print("Choose line: ");
		int line1 = read.nextInt();
		System.out.print("Choose column: ");
		int column1 = read.nextInt();
		board[line1][column1] = "X";
//board2
		for (int i = 0; i < 3; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < 3; j++) {
				if (board[i][j] != null) {
					System.out.print("[ " + board[i][j] + " ] ");
				} else {
					System.out.print("[   ]");
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 0; i < 3; i++) {
			System.out.print("     " + i);
		}
//**Player 2 turn
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("        PLAYER 2");

		System.out.print("Choose line: ");
		int line2 = read.nextInt();
		System.out.print("Choose column: ");
		int column2 = read.nextInt();
		board[line2][column2] = "O";
//board3
		for (int i = 0; i < 3; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < 3; j++) {
				if (board[i][j] != null) {
					System.out.print("[ " + board[i][j] + " ] ");
				} else {
					System.out.print("[   ]");
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 0; i < 3; i++) {
			System.out.print("     " + i);
		}
//*Player 1 turn _________________________________________
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("        PLAYER 1");

		System.out.print("Choose line: ");
		int line3 = read.nextInt();
		System.out.print("Choose column: ");
		int column3 = read.nextInt();
		board[line3][column3] = "X";
// board4
		for (int i = 0; i < 3; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < 3; j++) {
				if (board[i][j] != null) {
					System.out.print("[ " + board[i][j] + " ] ");
				} else {
					System.out.print("[   ]");
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 0; i < 3; i++) {
			System.out.print("     " + i);
		}

//**Player 2 turn
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("        PLAYER 2");

		System.out.print("Choose line: ");
		int line4 = read.nextInt();
		System.out.print("Choose column: ");
		int column4 = read.nextInt();
		board[line4][column4] = "O";
//board5
		for (int i = 0; i < 3; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < 3; j++) {
				if (board[i][j] != null) {
					System.out.print("[ " + board[i][j] + " ] ");
				} else {
					System.out.print("[   ]");
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 0; i < 3; i++) {
			System.out.print("     " + i);
		}
		winCheck.checkWinY(board);
		winCheck.checkWinX(board);

//*Player 1 turn _________________________________________
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("        PLAYER 1");

		System.out.print("Choose line: ");
		int line5 = read.nextInt();
		System.out.print("Choose column: ");
		int column5 = read.nextInt();
		board[line5][column5] = "X";
// board6
		for (int i = 0; i < 3; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < 3; j++) {
				if (board[i][j] != null) {
					System.out.print("[ " + board[i][j] + " ] ");
				} else {
					System.out.print("[   ]");
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 0; i < 3; i++) {
			System.out.print("     " + i);
		}

		System.out.println();

		winCheck.checkWinY(board);
		winCheck.checkWinX(board);

// **Player 2 turn
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("        PLAYER 2");

		System.out.print("Choose line: ");
		int line6 = read.nextInt();
		System.out.print("Choose column: ");
		int column6 = read.nextInt();
		board[line6][column6] = "O";
// board7
		for (int i = 0; i < 3; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < 3; j++) {
				if (board[i][j] != null) {
					System.out.print("[ " + board[i][j] + " ] ");
				} else {
					System.out.print("[   ]");
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 0; i < 3; i++) {
			System.out.print("     " + i);
		}

		winCheck.checkWinY(board);
		winCheck.checkWinX(board);

// *Player 1 turn _________________________________________
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("        PLAYER 1");

		System.out.print("Choose line: ");
		int line7 = read.nextInt();
		System.out.print("Choose column: ");
		int column7 = read.nextInt();
		board[line7][column7] = "X";
// board8
		for (int i = 0; i < 3; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < 3; j++) {
				if (board[i][j] != null) {
					System.out.print("[ " + board[i][j] + " ] ");
				} else {
					System.out.print("[   ]");
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 0; i < 3; i++) {
			System.out.print("     " + i);
		}

		winCheck.checkWinY(board);
		winCheck.checkWinX(board);

// **Player 2 turn
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("        PLAYER 2");

		System.out.print("Choose line: ");
		int line8 = read.nextInt();
		System.out.print("Choose column: ");
		int column8 = read.nextInt();
		board[line8][column8] = "O";
// board9
		for (int i = 0; i < 3; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < 3; j++) {
				if (board[i][j] != null) {
					System.out.print("[ " + board[i][j] + " ] ");
				} else {
					System.out.print("[   ]");
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 0; i < 3; i++) {
			System.out.print("     " + i);
		}
		winCheck.checkWinY(board);
		winCheck.checkWinX(board);
// *Player 1 turn _________________________________________
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("        PLAYER 1");

		System.out.print("Choose line: ");
		int line9 = read.nextInt();
		System.out.print("Choose column: ");
		int column9 = read.nextInt();
		board[line9][column9] = "X";
// board8
		for (int i = 0; i < 3; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < 3; j++) {
				if (board[i][j] != null) {
					System.out.print("[ " + board[i][j] + " ] ");
				} else {
					System.out.print("[   ]");
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 0; i < 3; i++) {
			System.out.print("     " + i);
		}

		winCheck.checkWinY(board);
		winCheck.checkWinX(board);

		read.close();

	}
}

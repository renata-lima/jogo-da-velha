package entities;

public class Board {

	public void printBoard(String[][] board) {
		board = new String[3][3];
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
	}

	public void printBoardTurns(String[][] board) {
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

	}
}

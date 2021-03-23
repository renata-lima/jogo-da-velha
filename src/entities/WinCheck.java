package entities;

public class WinCheck {
	public String board[][] = new String[3][3];

	public WinCheck() {
	}

	public void checkWinX(String board[][]) {
//COLUMNSx
		if (board[0][0] == "X" && board[1][0] == "X" && board[2][0] == "X") {
			System.out.println("Player 1 wins!");
			System.exit(0);
		} else {
			if (board[0][1] == "X" && board[1][1] == "X" && board[2][1] == "X") {
				System.out.println("Player 1 wins!");
				System.exit(0);
			} else {
				if (board[0][2] == "X" && board[1][2] == "X" && board[2][2] == "X") {
					System.out.println("Player 1 wins!");
					System.exit(0);
				}
			}
		}

//DIAGONALSx

		if (board[0][0] == "X" && board[1][1] == "X" && board[2][2] == "X") {
			System.out.println("Player 1 wins!");
			System.exit(0);
		} else {
			if (board[2][0] == "X" && board[1][1] == "X" && board[0][2] == "X") {
				System.out.println("Player 1 wins!");
				System.exit(0);
			}
		}

//LINESx

		if (board[0][0] == "X" && board[0][1] == "X" && board[0][2] == "X") {
			System.out.println("Player 1 wins!");
			System.exit(0);
		} else {
			if (board[1][0] == "X" && board[1][1] == "X" && board[1][2] == "X") {
				System.out.println("Player 1 wins!");
				System.exit(0);
			} else {
				if (board[2][0] == "X" && board[2][1] == "X" && board[2][2] == "X") {
					System.out.println("Player 1 wins!");
					System.exit(0);
				}
			}
		}

	}

	public void checkWinY(String board[][]) {
//COLUNMSy
		if (board[0][0] == "O" && board[1][0] == "O" && board[2][0] == "O") {
			System.out.println("Player 2 wins!");
			System.exit(0);
		} else {
			if (board[0][1] == "O" && board[1][1] == "O" && board[2][1] == "O") {
				System.out.println("Player 2 wins!");
				System.exit(0);

			} else {
				if (board[0][2] == "O" && board[1][2] == "O" && board[2][2] == "O") {
					System.out.println("Player 2 wins!");
					System.exit(0);
				}
			}
		}

//DIAGONALSy
		if (board[0][0] == "O" && board[1][1] == "O" && board[2][2] == "O") {
			System.out.println("Player 2 wins!");
			System.exit(0);
		} else {
			if (board[2][0] == "O" && board[1][1] == "O" && board[0][2] == "O") {
				System.out.println("Player Y wins!");
				System.exit(0);
			}
		}

//LINESy

		if (board[0][0] == "O" && board[0][1] == "O" && board[0][2] == "O") {
			System.out.println("Player 2 wins!");
			System.exit(0);
		} else {
			if (board[1][0] == "O" && board[1][1] == "O" && board[1][2] == "O") {
				System.out.println("Player 2 wins!");
				System.exit(0);
			} else {
				if (board[2][0] == "O" && board[2][1] == "O" && board[2][2] == "O") {
					System.out.println("Player 2 wins!");
					System.exit(0);
				}
			}
		}

	}
}

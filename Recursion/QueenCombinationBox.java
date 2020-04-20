package HackerBlocks.Recursion;

import java.util.Scanner;

public class QueenCombinationBox {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int boxes = scn.nextInt();
		int tq = scn.nextInt();
		boolean[] box = new boolean[boxes];

//		queenCombination1D(box, tq, 0, 0, "");
		queenCombination2D(new boolean[boxes][boxes], tq, 0, 0, 0, "");

	}

	private static void queenCombination2D(boolean[][] board, int tq, int qpsf, int row, int col, String ans) {

		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}

		if (col == board[0].length) {
			row = row + 1;
			col = 0;
		}

		if (row == board.length) {
			return;
		}

		// yes
		board[row][col] = true;
		queenCombination2D(board, tq, qpsf + 1, row, col + 1, ans + "[" + row + " : " + col + "]");
		board[row][col] = false;

		// no
		queenCombination2D(board, tq, qpsf, row, col + 1, ans);

	}

	private static void queenCombination1D(boolean[] box, int tq, int qpsf, int col, String ans) {

		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}

		if (col >= box.length) {
			return;
		}

		// yes
		box[col] = true;
		queenCombination1D(box, tq, qpsf + 1, col + 1, ans + "b" + col);
		box[col] = false;

		// no
		queenCombination1D(box, tq, qpsf, col + 1, ans);

	}

}

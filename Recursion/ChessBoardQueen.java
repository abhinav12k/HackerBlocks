package HackerBlocks.Recursion;

import java.util.Scanner;

public class ChessBoardQueen {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int tq = scn.nextInt();

		boolean[][] board = new boolean[size][size];

		chessBoardQueen(board, tq, 0, 0, 0, "");

	}

	private static void chessBoardQueen(boolean[][] board, int tq, int qpsf, int row, int col, String ans) {

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

		if (isItSafe(board, row, col)) {
			// yes
			board[row][col] = true;
			chessBoardQueen(board, tq, qpsf + 1, row, col + 1, ans + "[" + row + " : " + col + "]");
			board[row][col] = false;
		}

		// no
		chessBoardQueen(board, tq, qpsf, row, col + 1, ans);
	}

	public static boolean isItSafe(boolean[][] board, int row, int col) {

		// vertically up
		int r = row - 1;
		int c = col;

		while (r >= 0) {
			if (board[r][c])
				return false;
			r--;
		}

		// horizontally
		r = row;
		c = col - 1;
		while (c >= 0) {
			if (board[r][c])
				return false;
			c--;
		}

		// diagonally left
		r = row - 1;
		c = col - 1;
		while (r >= 0 && c >= 0) {
			if (board[r][c])
				return false;
			r--;
			c--;
		}

		// diagonally right
		r = row - 1;
		c = col + 1;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c])
				return false;
			r--;
			c++;
		}

		return true;
	}
}

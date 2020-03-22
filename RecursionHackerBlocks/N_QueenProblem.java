package HackerBlocks.RecursionHackerBlocks;

import java.util.Scanner;

public class N_QueenProblem {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();

		boolean[][] board = new boolean[size][size];

		System.out.println(numberOfQueens(board, 0, 0, 0, board.length, ""));

	}

	static int count = 0;

	private static int numberOfQueens(boolean[][] board, int cr, int cc, int qpsf, int tq, String ans) {

		if (qpsf == tq) {
			System.out.println(ans);
			++count;
			return 1;
		}

		if (cc == board[0].length) {
			cr = cr + 1;
			cc = 0;
		}

		if (cr == board.length) {
			return 0;
		}

		// Two possibilities either knight will be placed or not
		// yes
		if (isItSafe(board, cr, cc)) {
			board[cr][cc] = true;
			int pr=cr+1;
			int pc=cc+1;
			numberOfQueens(board, cr, cc + 1, qpsf + 1, tq, ans + "{" + pr + "-" + pc + "} ");
			board[cr][cc] = false;
		}

		// no
		numberOfQueens(board, cr, cc + 1, qpsf, tq, ans);
		return count;
	}

	private static boolean isItSafe(boolean[][] board, int row, int col) {

		// horizontal
				int r = row;
				int c = col - 1;
				while (c >= 0) {
					if (board[r][c])
						return false;
					c--;
				}

				// vertical
				r = row - 1;
				c = col;
				while (r >= 0) {
					if (board[r][c])
						return false;
					r--;
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

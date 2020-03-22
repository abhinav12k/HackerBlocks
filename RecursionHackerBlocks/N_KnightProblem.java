package HackerBlocks.RecursionHackerBlocks;

import java.util.Scanner;

public class N_KnightProblem {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();

		boolean[][] board = new boolean[size][size];

		System.out.println(numberOfKnights(board, 0, 0, 0, board.length, ""));

	}

	static int count = 0;

	private static int numberOfKnights(boolean[][] board, int cr, int cc, int kpsf, int tk, String ans) {

		if (kpsf == tk) {
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
			numberOfKnights(board, cr, cc + 1, kpsf + 1, tk, ans + "{" + cr + "-" + cc + "} ");
			board[cr][cc] = false;
		}

		// no
		numberOfKnights(board, cr, cc + 1, kpsf, tk, ans);
		return count;
	}

	private static boolean isItSafe(boolean[][] board, int row, int col) {

		int r = row - 1;
		int c = col - 2;
		if (r >= 0 && c >= 0 && board[r][c])
			return false;

		r = row - 1;
		c = col + 2;
		if (r >= 0 && c < board[0].length && board[r][c])
			return false;

		r = row - 2;
		c = col - 1;
		if (r >= 0 && c >= 0 && board[r][c])
			return false;

		r = row - 2;
		c = col + 1;
		if (r >= 0 && c < board[0].length && board[r][c])
			return false;

		return true;

	}

}

package HackerBlocks.RecursionHackerBlocks;

import java.util.Scanner;

public class N_queen_problem {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();

		int noq = size;

		boolean[][] board = new boolean[size][size];

		System.out.println(numberOfQueens(board, 0, 0, 0, noq, ""));
	}

	private static int numberOfQueens(boolean[][] board, int cr, int cc, int qpsf, int tq, String ans) {
		// TODO Auto-generated method stub
		int count = 0;
		if (qpsf == tq) {
			System.out.println(ans);
			return 1;
		}

		if (cc == board[0].length) {
			cc = 0;
			cr = cr + 1;
		}

		if (cr == board.length) {
			return 0;
		}

		// Either the queen will be placed or not!
		if (isItSafe(board, cr, cc)) {
			board[cr][cc] = true;
			int pr = cr+1;
			int pc = cc+1;
			count += numberOfQueens(board, cr, cc + 1, qpsf + 1, tq, ans + "{" + pr  + "-" + pc + "} ");
			board[cr][cc] = false;

		}
		count+=numberOfQueens(board, cr, cc + 1, qpsf, tq, ans);

		return count;
	}

	private static boolean isItSafe(boolean[][] board, int cr, int cc) {

		// vertically Up
		int r = cr - 1;
		int c = cc;
		while (r >= 0) {
			if (board[r][c])
				return false;
			r--;
		}

		// vertically down -- no need for this because we are placing pieces line by
		// line
//		r=cr+1;
//		c=cc;
//		while(r<=board.length-1) {
//			if(board[r][c])
//				return false;
//			r++;
//		}

		// left
		r = cr;
		c = cc - 1;
		while (c >= 0) {
			if (board[r][c])
				return false;
			c--;
		}

		// right -- no need
//		r=cr;
//		c=cc+1;
//		while(c<=board[0].length) {
//			if(board[r][c])
//				return false;
//			c++;
//		}

		// diagonally left
		r = cr - 1;
		c = cc - 1;
		while (r >= 0 && c >= 0) {

			if (board[r][c])
				return false;
			r--;
			c--;
		}

		// diagonally right
		r = cr - 1;
		c = cc + 1;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c])
				return false;
			r--;
			c++;
		}
		return true;
	}

}

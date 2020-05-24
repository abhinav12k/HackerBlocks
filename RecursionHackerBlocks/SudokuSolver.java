package HackerBlocks.RecursionHackerBlocks;

import java.util.Scanner;

public class SudokuSolver {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();

		int[][] board = new int[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				board[i][j] = scn.nextInt();
			}
		}

		printSolution(board, 0, 0);

	}

	private static void printSolution(int[][] board, int row, int col) {
		// TODO Auto-generated method stub
		if (row == board.length - 1 && col == board[0].length) {
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[0].length; j++) {
					System.out.print(board[i][j] + " ");
				}
				System.out.println();
			}
			return;
		}

		if (col == board[0].length) {
			row = row + 1;
			col = 0;
		}

		if (row >= board.length) {
			return;
		}

		// Have a default value
		if (board[row][col] != 0) {
			printSolution(board, row, col + 1);
			return;
		}

		for (int i = 1; i <= 9; i++) {
			if (isItSafe(board, row, col, i)) {
				board[row][col] = i;
				printSolution(board, row, col + 1);
			}
			board[row][col] = 0;
		}
	}

	public static boolean isItSafe(int[][] board, int row, int col, int ans) {

		// vertically up
		int r = row - 1;
		int c = col;

		while (r >= 0) {
			if (board[r][c] == ans)
				return false;
			r--;
		}

		// horizontally left
		r = row;
		c = col - 1;
		while (c >= 0) {
			if (board[r][c] == ans)
				return false;
			c--;
		}

		// horizontally right
		r = row;
		c = col + 1;
		while (c < board[0].length) {
			if (board[r][c] == ans)
				return false;
			c++;
		}

		// vertically down
		r = row + 1;
		c = col;
		while (r < board.length) {
			if (board[r][c] == ans) {
				return false;
			}
			r++;
		}

		// within box
		r = row - row % 3;
		c = col - col % 3;
		for (int i = r; i < r + 3; i++) {
			for (int j = c; j < c + 3; j++) {
				if (board[i][j] == ans)
					return false;
			}
		}
		return true;
	}


}

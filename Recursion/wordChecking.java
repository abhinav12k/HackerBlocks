package HackerBlocks.Recursion;

import java.util.Scanner;

public class wordChecking {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		char[][] arr = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'F', 'E' } };
		String word = scn.next();

		boolean ans = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == word.charAt(0)) {
					ans = ans || checkWord(arr, 0, 0, word, 0, new boolean[arr.length][arr[0].length]);
				}

			}
		}

		if (ans)
			System.out.println(true);
		else
			System.out.println(false);

	}

	public static boolean checkWord(char[][] board, int cr, int cc, String word, int vidx, boolean[][] visited) {

		if (vidx == word.length()) {
			return true;
		}

		if (cc < 0 || cr < 0 || cc >= board.length || cr >= board[0].length || visited[cr][cc] == true) {
			return false;
		}

		if (word.charAt(vidx) != board[cr][cc]) {
			return false;
		}

		visited[cr][cc] = true;

		// up
		boolean u = checkWord(board, cr - 1, cc, word, vidx + 1, visited);

		// down
		boolean d = checkWord(board, cr + 1, cc, word, vidx + 1, visited);

		// right
		boolean r = checkWord(board, cr, cc + 1, word, vidx + 1, visited);

		// left
		boolean l = checkWord(board, cr, cc - 1, word, vidx + 1, visited);

		visited[cr][cc] = false;
		return u || d || r || l;
	}

}

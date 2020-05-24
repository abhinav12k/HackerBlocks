package HackerBlocks.RecursionHackerBlocks;

import java.util.ArrayList;
import java.util.Scanner;

public class chess_Board_2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();

		int[][] board = new int[size][size];

		int count = 1;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				board[i][j] = count;
				count++;
			}
		}

		ArrayList<Integer> primes = new ArrayList<>();

		for (int i = 2; i < size * size; i++) {
			if (isPrime(i)) {
				primes.add(i);
			}
		}

		System.out.println(boardSolution(board, 0, 0, board.length - 1, board[0].length - 1, primes, ""));

	}

	private static int boardSolution(int[][] board, int cr, int cc, int fr, int fc, ArrayList<Integer> primes,
			String ans) {
		int count = 0;

		if (cr == fr && cc == fc) {
			System.out.println(ans + "{" + fr + "-" + fc + "}");
			return 1;
		}

		if (cc > fc || cr > fr) {
			return 0;
		}

		if (isPrime(board[cr][cc])) {

			for (int i = 0; i < primes.size(); i++) {
				if (i % 2 == 0) {
					// mine
					if (board[cr][cc] == primes.get(i)) {
						return 0;
					}
				} else {
					// port directly pass to finishing position
					if (board[cr][cc] == primes.get(i)) {
						System.out.println(ans + "{" + cr + "-" + cc + "}P{" + fr + "-" + fc + "} ");
						count++;
					}
				}
			}

		}

		// knight moves
		count += boardSolution(board, cr + 2, cc + 1, fr, fc, primes, ans + "{" + cr + "-" + cc + "}k");
		count += boardSolution(board, cr + 1, cc + 2, fr, fc, primes, ans + "{" + cr + "-" + cc + "}k");

		// Rook moves
		if (cc == 0 || cc == fc || cr == 0 || cr == fr) {
			for (int i = 1; i <= fr; i++) {
				count += boardSolution(board, cr, cc + i, fr, fc, primes, ans + "{" + cr + "-" + cc + "}R");
			}
			for (int i = 1; i <= fr; i++) {
				count += boardSolution(board, cr + i, cc, fr, fc, primes, ans + "{" + cr + "-" + cc + "}R");
			}
		}

		// Bishop moves
		if (cc == cr || cc + cr == fr) {

			for (int moves = 1; moves <= fr; moves++) {
				count += boardSolution(board, cr + moves, cc + moves, fr, fc, primes, ans + "{" + cr + "-" + cc + "}B");
			}

		}

		return count;

	}

	private static boolean isPrime(int num) {

		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}

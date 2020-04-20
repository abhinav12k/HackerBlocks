package HackerBlocks.Arrays;

import java.util.Scanner;

public class PainterProblem {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int nop = scn.nextInt();
		int nob = scn.nextInt();
		long[] boards = new long[nob];
		long sum = 0;
		for (int i = 0; i < boards.length; i++) {
			boards[i] = scn.nextLong();
			sum += boards[i];
		}
		long start = boards[boards.length - 1];
		System.out.println(minTime(boards, start, sum, nop));
	}

	// using binary search
	public static long minTime(long[] boards, long start, long end, int nop) {

		long finalAns = 0;

		while (start <= end) {
			long mid = (start + end) / 2;

			if (ifvalidConfig(boards, nop, mid)) {
				finalAns = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}
		return finalAns;
	}

	private static boolean ifvalidConfig(long[] board, int nop, long mid) {

		int painters = 1;
		long current_board = 0;

		for (int i = 0; i < board.length; i++) {

			if (current_board + board[i] > mid) {
				current_board = board[i];
				painters++;
				if (painters > nop) {
					return false;
				}

			} else {
				current_board += board[i];
			}

		}
		return true;
	}

}

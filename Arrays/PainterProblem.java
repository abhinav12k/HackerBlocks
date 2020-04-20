package HackerBlocks.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PainterProblem {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int nop = scn.nextInt();
		int nob = scn.nextInt();
		int[] boards = new int[nob];
		int sum = 0;
		for (int i = 0; i < boards.length; i++) {
			boards[i] = scn.nextInt();
			sum += boards[i];
		}
		Arrays.sort(boards);
		int start = boards[boards.length - 1];
		System.out.println(minTime(boards, 0, sum, nop));
	}

	// using binary search
	public static int minTime(int[] boards, int start, int end, int nop) {

		int finalAns = 0;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (ifvalidConfig(boards, nop, mid)) {
				finalAns = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}
		return finalAns;
	}

	private static boolean ifvalidConfig(int[] board, int nop, int mid) {

		int painters = 1;
		int current_board = 0;

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

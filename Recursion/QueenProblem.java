package HackerBlocks.Recursion;

import java.util.Scanner;

public class QueenProblem {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int boxes = scn.nextInt();
		int tq = scn.nextInt();
		boolean[] box = new boolean[boxes];

		System.out.println(queenPermutation(box, tq, 0, ""));
//		queenCombination(box, tq, 0, "", 0);
		
	}

	private static int queenPermutation(boolean[] box, int tq, int qpsf, String ans) {

		if (qpsf == tq) {
			System.out.println(ans);
			return 1;
		}

		int count = 0;
		for (int i = 0; i < box.length; i++) {
			if (!box[i]) {
				box[i] = true;
				count += queenPermutation(box, tq, qpsf + 1, ans + "q" + qpsf + "b" + i);
				box[i] = false;
			}
		}
		return count;
	}

	public static void queenCombination(boolean[] box, int tq, int qpsf, String ans, int lastBoxUsed) {

		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}

		for (int i = lastBoxUsed; i < box.length; i++) {
			if (!box[i]) {
				box[i] = true;
				queenCombination(box, tq, qpsf + 1, ans + "q" + qpsf + "b" + i, i);
				box[i] = false;
			}
		}
	}

}

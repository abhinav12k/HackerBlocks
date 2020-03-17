package HackerBlocks.RecursionHackerBlocks;

import java.util.Scanner;

public class BoardPath {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int target = scn.nextInt();
		int dice = scn.nextInt();

		System.out.println(boardPath(target, dice, ""));
	}

	public static int boardPath(int target, int dice, String ans) {

		if (target == 0) {
			System.out.print(ans + " ");
			return 1;
		}

		if (target < 0) {
			return 0;
		}

		int sum = 0;

		for (int i = 1; i <= dice; i++) {
			sum += boardPath(target - i, dice, ans + i);
		}
		return sum;
	}

}

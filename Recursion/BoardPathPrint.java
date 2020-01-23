package HackerBlocks.Recursion;

import java.util.Scanner;

public class BoardPathPrint {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int start = scn.nextInt();
		int end = scn.nextInt();

		boardpathPrint(start, end, "");

	}

	private static void boardpathPrint(int start, int end, String ans) {

		if (start == end) {
			System.out.println(ans);
			return;
		}

		if (start > end) {
			return;
		}

		for (int dice = 1; dice <= 6; dice++) {
			boardpathPrint(start + dice, end, dice + ans);
		}

	}

}

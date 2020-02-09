package HackerBlocks.RecursionHackerBlocks;

import java.util.Scanner;

public class generateBinaryStrings {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();

		while (tc-- != 0) {

			String test = scn.next();
			int size = test.length();
			generate(test, 0, size, "");

		}

	}

	private static void generate(String ques, int vidx, int size, String ans) {

		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		if (vidx > size) {
			return;
		}

		if (ques.charAt(vidx) == '?') {
			// 1
			generate(ques.substring(vidx + 1), vidx + 1,size, ans + 1);
			// 0
			generate(ques.substring(vidx + 1), vidx + 1,size, ans + 0);
		} else {
			generate(ques.substring(vidx + 1), vidx + 1,size, ans + ques.charAt(vidx));
		}

	}

}

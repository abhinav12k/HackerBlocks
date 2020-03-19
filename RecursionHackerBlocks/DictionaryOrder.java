package HackerBlocks.RecursionHackerBlocks;

import java.util.Scanner;

public class DictionaryOrder {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		char[] ch = str.toCharArray();

		greater(ch, 0);
	}

	public static String greater(char[] ques, int vidx) {

		String max = String.valueOf(ques);

		if (vidx == ques.length) {
			return max;
		}

		if (vidx > ques.length) {
			return "";
		}

		for (int i = vidx; i < ques.length; i++) {
			for (int j = i + 1; j < ques.length; j++) {

				int ch1 = ques[i];
				int ch2 = ques[j];

				if (ch1 < ch2) {
					// swap
					swap(ques, i, j);
					String ans = greater(ques, vidx + 1);

					if (max.compareTo(ans) < 0&&!max.equals(ans)) {
						max = ans;
						System.out.println(max);
					}
					swap(ques, i, j);
				}

			}
		}
		return max;
	}

	public static void swap(char[] ques, int i, int j) {
		// swapping logic
		char ch = ques[j];
		ques[j] = ques[i];
		ques[i] = ch;
	}
}

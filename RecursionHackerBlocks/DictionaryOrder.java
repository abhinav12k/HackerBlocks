package HackerBlocks.RecursionHackerBlocks;

import java.util.Scanner;

public class DictionaryOrder {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.next();

		larger(str, str, "");

	}

	private static void larger(String track, String ques, String ans) {

		if (ques.length() == 0) {
			for (int i = 0; i < track.length() - 1; i++) {
				int ch1 = track.charAt(i);
				int chAns = ans.charAt(i);

				if (chAns > ch1) {
					System.out.println(ans);
					return;
				} else if (chAns == ch1) {
					if (ans.charAt(i + 1) > track.charAt(i + 1)) {
						System.out.println(ans);
						return;
					}
				} else {
					return;
				}

			}

		}

		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			larger(track, ques.substring(0, i) + ques.substring(i + 1), ans + ch);
		}

	}

}

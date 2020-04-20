package HackerBlocks.Recursion;

import java.util.Scanner;

public class PossibleToggling {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.next();

		// a1b1
		strings(str, "");
	}

	private static void strings(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		if (ques.length() < 0) {
			return;
		}

		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		if (ch >= '1' && ch <= '9') {
			strings(roq,ans+ch);
		}else {
			strings(roq,ans+Character.toUpperCase(ch));
			strings(roq, ans+Character.toLowerCase(ch));
		}

	}

}

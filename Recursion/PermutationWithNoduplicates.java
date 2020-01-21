package HackerBlocks.Recursion;

import java.util.Scanner;

public class PermutationWithNoduplicates {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.next();

		permuatationNoD(str, "");
	}

	private static void permuatationNoD(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			char temp = ch;

			int flag = 1;
			for (int j = i + 1; j <= ques.length() - 1; j++) {

				if (ques.charAt(j) == temp)
					flag = 0;

			}

			if (flag == 1)
				permuatationNoD(ques.substring(0, i) + ques.substring(i + 1), ans + ch);

		}

	}

}

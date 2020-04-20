package HackerBlocks.Recursion;

import java.util.Scanner;

public class KeypadUsingRecursion {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		keypadCombination(str, "");

	}

	private static void keypadCombination(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);
		String chs = getCode(ch);
		String roq = ques.substring(1);

		for (int i = 0; i < chs.length(); i++) {
			char newChar = chs.charAt(i);
			keypadCombination(roq, ans + newChar);
		}

	}

	public static String getCode(char ch) {
		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jk";
		else if (ch == '5')
			return "lmno";
		else if (ch == '6')
			return "pqr";
		else if (ch == '7')
			return "stu";
		else if (ch == '8')
			return "vwx";
		else if (ch == '9')
			return "yz";
		else if (ch == '0')
			return "@#";
		else
			return "";
	}

}

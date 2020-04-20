package HackerBlocks.Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class keypadCombination {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String number = scn.next();

		System.out.println(KeypadCombination(number));

	}

	private static ArrayList<String> KeypadCombination(String str) {

		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char ch = str.charAt(0);
		String chs = getCode(ch);
		String ros = str.substring(1);

		ArrayList<String> rr = KeypadCombination(ros);
		ArrayList<String> mr = new ArrayList<>();

		for (int i = 0; i < chs.length(); i++) {
			for (String val : rr) {
				mr.add(chs.charAt(i) + val);
			}
		}
		return mr;
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

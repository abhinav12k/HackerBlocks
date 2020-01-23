package HackerBlocks.Recursion;

import java.util.Scanner;

public class ValidParenthesis {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		validParenthesis(n, 0, 0, "");

	}

	private static void validParenthesis(int n, int open, int close, String ans) {

		if (n == open && n == close) {
			System.out.println(ans);
			return;
		}

		if (open > n || close > n || close > open) {
			return;
		}

		validParenthesis(n, open + 1, close, ans + "(");
		validParenthesis(n, open, close + 1, ans + ")");

	}

}

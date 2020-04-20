package HackerBlocks.RecursionHackerBlocks;

import java.util.ArrayList;
import java.util.Scanner;

public class GenerateParenthesis {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		String ans = "";
		generateParenthesis(n, 0, 0, ans);

	}

	public static void generateParenthesis(int n, int open, int close, String ans) {

		if (open == n && close == n) {
			System.out.println(ans);
			return;
		}

		if (close > open || close > n || open > n) {
			return;
		}
		// close
		generateParenthesis(n, open, close + 1, ans + ")");

		// open
		generateParenthesis(n, open + 1, close, ans + "(");

	}

}

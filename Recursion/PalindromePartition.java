package HackerBlocks.Recursion;

import java.util.Scanner;

public class PalindromePartition {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.next();

		palindromePartition(str, "");

	}

	private static void palindromePartition(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 1; i <= ques.length(); i++) {
			String part = ques.substring(0, i);
			String roq = ques.substring(i);

			if (isPalindrome(part)) {
				palindromePartition(roq, ans + part + " ");
			}

		}

	}

	private static boolean isPalindrome(String str) {

		int left = 0;
		int right = str.length() - 1;

		while (left < right) {

			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}

			left++;
			right--;
		}
		return true;
	}
}

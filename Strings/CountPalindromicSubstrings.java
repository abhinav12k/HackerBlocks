package HackerBlocks.Strings;

import java.util.Scanner;

public class CountPalindromicSubstrings {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(countPalindrome(str));

	}

	private static int countPalindrome(String str) {
		int count = 0;
		for (int si = 0; si < str.length(); si++) {
			for (int ei = si + 1; ei <= str.length(); ei++) {
				if (isPalindrome(str.substring(si, ei))) {
					count++;
				}
			}
		}
		return count;
	}

	private static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length() - 1;

		while (left < right) {

			int ch1 = str.charAt(left);
			int ch2 = str.charAt(right);

			if (ch1 != ch2) {
				return false;
			}

			left++;
			right--;
		}
		return true;
	}

}

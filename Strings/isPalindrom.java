package HackerBlocks.Strings;

import java.util.Scanner;

public class isPalindrom {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.next();

		System.out.println(isPalindrome(str));

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

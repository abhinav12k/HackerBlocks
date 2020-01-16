package HackerBlocks.Strings;

import java.util.Scanner;

public class MinNumberFromSequence {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();

		while (tc-- != 0) {

			String str = scn.next();
			minSeq(str);
		}

	}

	private static void minSeq(String str) {
		// TODO Auto-generated method stub

		int[] ans = new int[str.length() + 1];
		int count = 1;
		for (int i = 0; i <= str.length(); i++) {

			if (i == str.length() || str.charAt(i) == 'I') {
				ans[i] = count++;
				for (int j = i - 1; j >= 0 && str.charAt(j) != 'I'; j--) {
					ans[j] = count++;
				}
			}

		}

		for (int val : ans) {
			System.out.print(val);
		}
		System.out.println();
	}

}

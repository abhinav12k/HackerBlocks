package HackerBlocks.ImportantProblems;

import java.util.Scanner;

public class PalindromeSScount {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.next();

		System.out.println(palindromicSScount(str));

	}

	private static int palindromicSScount(String str) {

		int count = 0;

		// odd palindrome
		for (int axis = 0; axis <= str.length() - 1; axis++) {
			for (int orbit = 0; (axis - orbit) >= 0 && axis + orbit <= str.length() - 1; orbit++) {

				if (str.charAt(axis - orbit) == str.charAt(axis + orbit))
					count++;
				else
					break;
			}

		}

		// even palindrome
		for (double axis = 0.5; axis <= str.length() - 1; axis++) {
			for (double orbit = 0.5; axis + orbit <= str.length() - 1 && axis - orbit >= 0; orbit++) {
				if (str.charAt((int) (axis - orbit)) == str.charAt((int) (axis + orbit)))
					count++;
				else
					break;
			}
		}
		return count;
	}

}

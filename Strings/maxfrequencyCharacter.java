package HackerBlocks.Strings;

import java.util.Scanner;

public class maxfrequencyCharacter {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.next();

		int[] frequency = new int[str.length()];

		for (int i = 0; i < str.length() - 1; i++) {
			frequency[i] = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					frequency[i]++;

					frequency[j] = '0';
				}
			}
		}

		int max = Integer.MIN_VALUE;
		char ch = '0';
		for (int i = 0; i < frequency.length; i++) {

			if (frequency[i] > max) {
				ch = str.charAt(i);
				max = frequency[i];
			}
		}
		System.out.println(ch);
	}

}

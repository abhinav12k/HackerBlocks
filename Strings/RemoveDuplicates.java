package HackerBlocks.Strings;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.next();

		int[] frequency = new int[str.length()];

		for (int i = 0; i < str.length(); i++) {
			frequency[i] = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					frequency[i]++;
				} else
					break;
			}
		}

		char ch = '0';
		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] == 1) {
				ch = str.charAt(i);
				System.out.print(ch);
			}
		}

	}

}

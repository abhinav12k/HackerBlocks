package HackerBlocks.Strings;

import java.util.Scanner;

public class differenceWithASCII {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.next();

		StringBuilder sb = new StringBuilder();
		int first = 0;
		int second = 1;
		while (second != str.length()) {
			char ch1 = str.charAt(first);
			char ch2 = str.charAt(second);
			if (first % 2 == 0)
				sb.append(ch1);
			int ascii1 = ch1;
			int ascii2 = ch2;
			int diff = ascii2 - ascii1;
			sb.append(diff);
			sb.append(ch2);
			first++;
			second++;
		}
		System.out.println(sb);
	}

}

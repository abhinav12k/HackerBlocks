package HackerBlocks.Strings;

import java.util.Scanner;

public class stringCompression {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.next();

		System.out.println(reducedString(str));
	}

	private static String reducedString(String str) {

		StringBuilder sb = new StringBuilder();
		int count = 1;

		sb.append(str.charAt(0));
		for (int i = 0; i < str.length() - 1; i++) {

			char a = str.charAt(i);
			char b = str.charAt(i + 1);

			if (a == b) {
				count++;
			} else {
				if (count > 1)
					sb.append(count);
				sb.append(b);
				count = 1;
			}
		}

		if (count > 1) {
			sb.append(count);
		}

		return sb.toString();
	}

}

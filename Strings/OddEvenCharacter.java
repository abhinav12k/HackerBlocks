package HackerBlocks.Strings;

import java.util.Scanner;

public class OddEvenCharacter {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.next();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= str.length() - 1; i++) {
			char ch = str.charAt(i);
			int ascii = ch;
			if (i % 2 == 0) {
				ascii = ascii + 1;
				char b = (char) ascii;
				sb.append(b);
			} else if (i % 2 == 1) {
				ascii = ascii - 1;
				char b = (char) ascii;
				sb.append(b);
			}
		}
		System.out.println(sb);
	}

}

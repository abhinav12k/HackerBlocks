package HackerBlocks.Strings;

import java.util.Scanner;

public class ToggleCase {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.next();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				System.out.print(Character.toLowerCase(ch));
			} else {
				System.out.print(Character.toUpperCase(ch));
			}
		}

	}

}

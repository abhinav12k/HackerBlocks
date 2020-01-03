package HackerBlocks.Basics;

import java.util.Scanner;

public class LowerUpper {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		char str = scn.next().charAt(0);
		int ascii = str;
		if (ascii >= 97 && ascii <= 127) {
			System.out.println("lowercase");
		} else if (Character.isUpperCase(str)) {
			System.out.println("UPPERCASE");
		} else {
			System.out.println("Invalid");
		}

	}

}

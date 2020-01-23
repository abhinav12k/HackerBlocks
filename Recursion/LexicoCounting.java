package HackerBlocks.Recursion;

import java.util.Scanner;

public class LexicoCounting {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int start = scn.nextInt();
		int end = scn.nextInt();

		lexico(start, end);

	}

	private static void lexico(int start, int end) {

		if (start > end) {
			return;
		}

		int i = 0;
		if (start == 0)
			i = 1;
		System.out.println(start);

		for (; i <= 9; i++)
			lexico(start * 10 + i, end);

	}

}

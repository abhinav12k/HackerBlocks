package HackerBlocks.Basics;

import java.util.Scanner;

public class ReverseN {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int rev = 0, rem = 0;

		while (n != 0) {

			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;

		}

		System.out.println(rev);

	}

}

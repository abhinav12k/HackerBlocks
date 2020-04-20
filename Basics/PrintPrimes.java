package HackerBlocks.Basics;

import java.util.Scanner;

public class PrintPrimes {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		for (int i = 2; i <= n; i++) {

			if (checkprime(i)) {
				System.out.println(i);
			}

		}

	}

	private static boolean checkprime(int i) {

		for (int j = 2; j * j <= i; j++) {

			if (i % j == 0) {
				return false;
			}

		}
		return true;
	}

}

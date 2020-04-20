package HackerBlocks.Basics;

import java.util.Scanner;

public class PrintFibonacci {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		long N = scn.nextLong();

		long a = 0, b = 1, c = 0;

		System.out.println(a);

		for (long i = 1; i <= N + 1; i++) {

			c = a + b;

			a = b;

			b = c;

			if (a <= N) {

				System.out.println(a);

			}

		}

	}

}

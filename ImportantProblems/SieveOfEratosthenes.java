package HackerBlocks.ImportantProblems;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int upLimit = scn.nextInt();

		soe(upLimit);

	}

	private static void soe(int upLimit) {

		boolean[] prime = new boolean[upLimit + 1];
		Arrays.fill(prime, true);

		for (int p = 2; p * p <= upLimit; p++) {
			if (prime[p] == true) {

				// update all multiplies of p
				for (int k = p * 2; k < upLimit; k += p) {
					prime[k] = false;
				}

			}
		}

		for (int i = 2; i < prime.length; i++) {
			if (prime[i]) {
				System.out.print(i+" ");
			}
		}

	}

}

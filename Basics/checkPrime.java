package HackerBlocks.Basics;

import java.util.Scanner;

public class checkPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int fact = 0;

		if (n == 1) {
			System.out.println("Not Prime");
		} else {

			for (int i = 2; i*i<= n; i++) {

				if (n % i == 0) {
					fact = 1;
					break;
				}

			}
			if (fact == 0) {
				System.out.println("Prime");
			} else {
				System.out.println("Not Prime");
			}
		}

	}

}

package HackerBlocks.Arrays;

import java.util.Scanner;

public class CBTshirt {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();

		while (tc-- != 0) {

			int n = scn.nextInt();

			for (int i = 1; i <= n; i++) {
				int ans = 0;
				int multiplier = 1;
				int number = i;
				while (number != 0) {
					int rem = number % 2;
					ans = ans + rem * multiplier;
					multiplier = multiplier * 10;
					number = number / 2;
				}

				System.out.print(ans + " ");
			}
		}

	}

}

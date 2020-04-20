package HackerBlocks.ImportantProblems;

import java.util.Scanner;

public class ChewbeccaAndNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		long multiplier = 1, num = 0;
		while (n > 0) {
			long rem = (n % 10);

			if (n != 9) {
				if (rem >= 5)
					rem = 9 - rem;
			}

			num += rem * multiplier;
			multiplier *= 10;
			n = n / 10;
		}
		System.out.println(num);
	}

}

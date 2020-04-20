package HackerBlocks.Basics;

import java.util.Scanner;

public class PatternWithZeroes {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int rows = scn.nextInt();

		int nst = 1;
		int val = 1;
		while (rows > 0) {

			int cst = 1;
			while (cst <= nst) {

				if (cst == 1 || cst == nst) {
					System.out.print(val + "\t");
				} else {
					System.out.print("0" + "\t");
				}
				cst++;

			}

			System.out.println();
			nst++;
			val++;
			rows--;
		}

	}

}

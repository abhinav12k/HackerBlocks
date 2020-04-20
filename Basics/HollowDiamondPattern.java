package HackerBlocks.Basics;

import java.util.Scanner;

public class HollowDiamondPattern {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int rows = scn.nextInt();
		int n = 1;
		int nst = rows / 2;
		int nsp = -1;
		while (n <= rows) {

			int cst = 0;
			while (cst <= nst) {

				System.out.print("*" + "\t");
				cst++;
			}

			int csp = 1;
			while (csp <= nsp) {

				System.out.print("\t");
				csp++;
			}

			if (n == 1 || n == rows) {
				cst = 1;
			} else
				cst = 0;
			while (cst <= nst) {

				System.out.print("*" + "\t");
				cst++;
			}

			System.out.println();
			if (n <= rows / 2) {
				nsp = nsp + 2;
				nst = nst - 1;
			} else {
				nsp = nsp - 2;
				nst = nst + 1;
			}
			n = n + 1;
		}

	}

}

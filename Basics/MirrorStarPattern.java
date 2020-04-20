package HackerBlocks.Basics;

import java.util.Scanner;

public class MirrorStarPattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int rows = scn.nextInt();

		int n = 1;
		int nst = 1;
		int nsp = rows / 2;
		while (n <= rows) {

			int csp = 1;
			while (csp <= nsp) {
				System.out.print("\t");
				csp++;
			}

			int cst = 1;
			while (cst <= nst) {
				System.out.print("*"+"\t");
				cst++;
			}

			System.out.println();
			if (n <= rows / 2) {
				nst += 2;
				nsp--;
			} else {
				nst -= 2;
				nsp++;
			}
			n++;
		}
	}
}

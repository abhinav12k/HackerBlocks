package HackerBlocks.Basics;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		// total number of rows=n;
		int row = 0;
		int nst = 1;

		while (row < n) {

			int val = 1;
			int cst = 0;
			while (cst < nst) {
				System.out.print(val + "\t");
				val = (val * (row - cst)) / (cst + 1);
				cst++;
			}
			System.out.println();
			nst++;
			row++;
		}

	}

}

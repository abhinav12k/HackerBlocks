package HackerBlocks.Basics;

import java.util.Scanner;

public class PrintSeries {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int nTerms = scn.nextInt();
		int nDivisible = scn.nextInt();
		int n = 1;
		int series;
		int count = 1;

		while (count <= nTerms) {
			series = 3 * n + 2;
			if (series % nDivisible != 0) {
				System.out.println(series);
				count++;
			}
			n++;
			
		}

	}

}

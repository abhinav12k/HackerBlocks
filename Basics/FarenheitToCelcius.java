package HackerBlocks.Basics;

import java.util.Scanner;

public class FarenheitToCelcius {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int minF = scn.nextInt();
		int maxF = scn.nextInt();
		int step = scn.nextInt();
		int F = minF;

		while (F <= maxF) {
			int c = (5*(F - 32))/9;
			System.out.println(F + "\t" + c);
			F += step;
		}
	}

}

package HackerBlocks.Basics;

import java.util.Scanner;

public class ConversionAnyBase {

	public static void main(String[] args) {

		// Conversion from any base to another base
		/*
		 * For converion from one base to another first we need to convert the number to
		 * decimal representation and then to the corresponding base.
		 */

		Scanner scn = new Scanner(System.in);
		int sb = scn.nextInt();
		int db = scn.nextInt();
		int n = scn.nextInt();

		System.out.println(conversion(sb, db, n));
	}

	private static int conversion(int sb, int db, int n) {

		int decimalEqui = 0;
		int requiredNumber = 0;
		int rem = 0;
		int multiplier = 1;

		// conersion to a decimal equivalent
		while (n != 0) {
			rem = n % 10;
			decimalEqui = decimalEqui + rem * multiplier;
			multiplier = multiplier * sb;
			n = n / 10;
		}
		multiplier = 1;
		// conversion to required base
		while (decimalEqui != 0) {
			rem = decimalEqui % db;
			requiredNumber = requiredNumber + rem * multiplier;
			multiplier = multiplier * 10;
			decimalEqui = decimalEqui / db;
		}
		return requiredNumber;
	}

}

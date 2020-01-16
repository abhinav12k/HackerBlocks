package HackerBlocks.Recursion;

import java.util.Scanner;

public class Basic_recursionFunctions {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

		// strictly decreasing
//		PD(num);
		// strictly increasing
//	PI(num);
		// PDI with skips
		PDI(num);

	}

	private static void PI(int num) {

		// strictly increasing
		if (num == 0) {
			return;
		}
		PI(num - 1);
		System.out.println(num);
	}

	private static int PD(int num) {
		// strictly decreasing numbers
		if (num == 0) {
			return 0;
		}

		System.out.println(num);
		return PD(num - 1);

	}

	public static void PDI(int num) {

		if (num == 0) {
			return;
		}

		if (num % 2 == 1)
			System.out.println(num);
		PDI(num - 1);
		if (num % 2 == 0) {
			System.out.println(num);

		}

	}

}

package HackerBlocks.Recursion;

import java.util.Scanner;

public class Basic_recursionFunctions {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
//		int num = scn.nextInt();

		// strictly decreasing
//		PD(num);
		// strictly increasing
//	PI(num);
		// PDI with skips
//		PDI(num);

		// factorial
//		System.out.println(fact(num));
//		System.out.println(power(2, 3));
		// nth fibonacci number
		System.out.println(fibonacci(2));

	}

	private static int fact(int num) {

		if (num == 1) {
			return num;
		}

		return num * fact(num - 1);

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

	public static long power(long x, long y) {

		if (y == 0) {
			return 1;
		}

		return x * power(x, y - 1);

	}

	public static int fibonacci(int n) {

		if (n == 0 || n == 1) {
			return n;
		}

		int a = fibonacci(n - 1);
		int b = fibonacci(n - 2);
		return a + b;
	}

}

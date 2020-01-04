package HackerBlocks.ImportantProblems;

import java.util.Scanner;

public class BostonNumbers {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		BostonNumbers(n);

	}

	public static void BostonNumbers(int n) {

		int digitSum = sumOfDigits(n);

		int factorSum = 0;

		int limit = n;

		for (int i = 2; i * i <= limit; i++) {

			if (isPrime(i)) {

				while (n % i == 0) {

					n = n / i;

					factorSum += sumOfDigits(i);

				}

			}

		}

		if (n > 1) {

			factorSum += sumOfDigits(n);

		}

		if (factorSum == digitSum) {

			System.out.println(1);

		} else {

			System.out.println(0);

		}

	}

	public static boolean isPrime(int n) {

		int div = 2;

		while (div * div <= n) {

			if (n % div == 0) {

				return false;

			}

			div++;

		}

		return true;

	}

	public static int sumOfDigits(int n) {

		int rem;

		int sum = 0;

		while (n != 0) {

			rem = n % 10;

			sum += rem;

			n = n / 10;

		}

		return sum;

	}
}

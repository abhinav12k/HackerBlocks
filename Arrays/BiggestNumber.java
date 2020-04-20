package HackerBlocks.Arrays;

import java.util.Scanner;

public class BiggestNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();
		while (tc != 0) {

			int size = scn.nextInt();

			int[] numbers = new int[size];

			for (int i = 0; i <= numbers.length - 1; i++) {

				numbers[i] = scn.nextInt();

			}

			bubbleSort(numbers);

			for (int val : numbers)

				System.out.print(val);

			System.out.println();

			tc--;

		}

	}

	public static void bubbleSort(int[] numbers) {

		int n = numbers.length;

		for (int count = 0; count <= n - 2; count++) {

			for (int j = 0; j <= n - count - 2; j++) {

				if (compare(numbers[j], numbers[j + 1])) {

					// swap

					int temp = numbers[j];

					numbers[j] = numbers[j + 1];

					numbers[j + 1] = temp;

				}

			}

		}

	}

	public static boolean compare(int i, int j) {

		String n1n2s = i + "" + j;

		String n2n1s = j + "" + i;

		int n1n2i = Integer.parseInt(n1n2s);

		int n2n1i = Integer.parseInt(n2n1s);

		if (n2n1i > n1n2i)

			return true;

		else

			return false;

	}

}

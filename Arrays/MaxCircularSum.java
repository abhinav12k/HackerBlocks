package HackerBlocks.Arrays;

import java.util.Scanner;

public class MaxCircularSum {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();

		while (tc-- != 0) {

			int size = scn.nextInt();
			int[] arr = new int[size];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
			}

			int maxSum = Integer.MIN_VALUE;
			for (int i = 0; i < arr.length; i++) {
				int Sum = 0;
				for (int j = i; j < i + arr.length; j++) {
					int k = j % arr.length;
					Sum += arr[k];
					if (maxSum <= Sum) {
						maxSum = Sum;
					}
				}

			}
			System.out.println(maxSum);
		}

	}

}

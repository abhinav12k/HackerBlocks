package HackerBlocks.Arrays;

import java.util.Scanner;

public class MaxSumPath {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();

		while (tc-- != 0) {
			int n = scn.nextInt();
			int m = scn.nextInt();
			int[] arr1 = new int[n];
			int[] arr2 = new int[m];
			for (int i = 0; i < arr1.length; i++) {
				arr1[i] = scn.nextInt();
			}
			for (int i = 0; i < arr2.length; i++) {
				arr2[i] = scn.nextInt();
			}

			int i = 0, j = 0;
			int sum1 = 0;
			int sum2 = 0;
			int finalAns = 0;
			while (i < arr1.length && j < arr2.length) {

				if (arr1[i] < arr2[j]) {
					sum1 += arr1[i];
					i++;
				} else if (arr1[i] > arr2[j]) {
					sum2 += arr2[j];
					j++;
				} else {
					finalAns += Math.max(sum1, sum2) + arr1[i];
					sum1 = 0;
					sum2 = 0;
					i++;
					j++;
				}
			}

			if (i == arr1.length) {

				while (j < arr2.length) {

					sum2 += arr2[j];

					j++;

				}

			}

			if (j == arr2.length) {

				while (i < arr1.length) {

					sum1 += arr1[i];

					i++;

				}

			}
			finalAns += Math.max(sum1, sum2);
			System.out.println(finalAns);
		}

	}

}

package HackerBlocks.RecursionHackerBlocks;

import java.util.ArrayList;
import java.util.Scanner;

public class generateSortedArrays {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int num1 = scn.nextInt();

		int num2 = scn.nextInt();

		int[] arr1 = new int[num1];

		for (int i = 0; i <= arr1.length - 1; i++) {
			arr1[i] = scn.nextInt();
		}

		int[] arr2 = new int[num2];

		for (int j = 0; j <= arr2.length - 1; j++) {

			arr2[j] = scn.nextInt();

		}

		int[] ans = new int[arr1.length + arr2.length];

		generateSorted(arr1, arr2, ans, 0, 0, 0, false);

	}

	public static void generateSorted(int[] arr1, int[] arr2, int[] ans, int i, int j, int len, boolean lastAtA) {

		if (!lastAtA) {

			if (len != 0) {

				display(ans, len + 1);

			}

			for (int k = i; k < arr1.length; k++) {

				if (len == 0) {

					ans[len] = arr1[k];

					generateSorted(arr1, arr2, ans, k + 1, j, len, true);

				} else {

					if (ans[len] < arr1[k]) {

						ans[len + 1] = arr1[k];

						generateSorted(arr1, arr2, ans, k + 1, j, len + 1, true);

					}

				}

			}

		} else {

			for (int k = j; k < arr2.length; k++) {

				if (ans[len] < arr2[k]) {

					ans[len + 1] = arr2[k];

					generateSorted(arr1, arr2, ans, i, k + 1, len + 1, false);

				}

			}

		}

	}

	public static void display(int[] C, int len) {

		for (int i = 0; i < len; i++) {

			System.out.print(C[i] + " ");

		}

		System.out.println();

	}

}

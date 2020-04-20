package HackerBlocks.Arrays;

import java.util.Scanner;

public class NextSmallerOfNextGreater {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();

		while (tc-- != 0) {
			int size = scn.nextInt();
			int[] arr = new int[size];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
			}

			int[] ans = new int[arr.length];
			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] > arr[i]) {
						if (i == arr.length - 2) {
							ans[i] = -1;
						}

						for (int k = j + 1; k < arr.length; k++) {

							if (arr[j] > arr[k]) {
								ans[i] = arr[k];
								break;
							} else {
								ans[i] = -1;
							}

						}
						break;
					} else {
						ans[i] = -1;
					}
				}
				if (i == arr.length - 1) {
					ans[i] = -1;
				}
			}

			for (int val : ans) {
				System.out.print(val + " ");
			}
		}

	}

}

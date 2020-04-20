package HackerBlocks.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumTriplets {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int target = scn.nextInt();
		Arrays.sort(arr);

		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == target) {
						int first = 0, second = 0, third = 0;
						if (arr[k] > arr[i] && arr[k] > arr[j]) {
							if (arr[i] > arr[j]) {
								first = arr[j]; // element1
								second = arr[i]; // element2
								third = arr[k]; // element3
							} else {
								first = arr[i]; // element1
								second = arr[j]; // element2
								third = arr[k]; // element3
							}
						} else if (arr[i] > arr[j] && arr[i] > arr[k]) {
							if (arr[j] > arr[k]) {
								first = arr[k]; // element1
								second = arr[j]; // element2
								third = arr[i]; // element3
							} else {
								first = arr[j];
								second = arr[k];
								third = arr[i];
							}
						} else if (arr[j] > arr[k] && arr[j] > arr[i]) {
							if (arr[k] > arr[i]) {
								first = arr[i]; // element1
								second = arr[k]; // element2
								third = arr[j]; // element3
							} else {
								first = arr[k];
								second = arr[i];
								third = arr[j];
							}
						}
						System.out.println(first + ", " + second + " and " + third);
					}
				}
			}
		}

	}

}

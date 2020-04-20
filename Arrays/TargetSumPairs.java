package HackerBlocks.Arrays;

import java.util.Scanner;

public class TargetSumPairs {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int target = scn.nextInt();

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] + arr[j] == target) {
					if (arr[i] < arr[j])
						System.out.println(arr[i] + " and " + arr[j]);
					else
						System.out.println(arr[j] + " and " + arr[i]);
				}

			}

		}

	}

}

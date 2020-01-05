package HackerBlocks.Arrays;

import java.util.Scanner;

public class MaxValueinArray {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(Max(arr));
	}

	private static int Max(int[] arr) {

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {

			if (max <= arr[i]) {
				max = arr[i];
			}

		}
		return max;
	}

}

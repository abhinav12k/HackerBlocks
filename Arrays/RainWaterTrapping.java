package HackerBlocks.Arrays;

import java.util.Scanner;

public class RainWaterTrapping {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();

		while (tc != 0) {
			int nTowers = scn.nextInt();
			int[] height = new int[nTowers];
			for (int i = 0; i <= nTowers - 1; i++) {
				height[i] = scn.nextInt();
			}
			System.out.println(harvestedWater(height));
			tc--;
		}

	}

	public static int harvestedWater(int[] array) {
		int water = 0;
		int[] left = new int[array.length];
		int[] right = new int[array.length];
		left[0] = array[0];
		right[array.length - 1] = array[array.length - 1];

		for (int i = 1; i <= array.length - 1; i++) {
			if (left[i - 1] > array[i])
				left[i] = left[i - 1];
			else
				left[i] = array[i];
		}

//		for (int i = 0; i <= array.length - 1; i++)
//
//			System.out.print(left[i] + " ");
//
//		System.out.println();

		for (int i = array.length - 2; i >= 0; i--) {
			if (right[i + 1] > array[i])
				right[i] = right[i + 1];
			else
				right[i] = array[i];
		}

//

//		for (int i = 0; i <= array.length - 1; i++)
//			System.out.print(right[i] + " ");

		for (int i = 1; i <= array.length - 1; i++) {
			int minHeight = Math.min(left[i], right[i]);
			water += minHeight - array[i];
		}

		return water;

	}

}

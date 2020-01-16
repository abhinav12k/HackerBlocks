package HackerBlocks.Recursion;

import java.util.Scanner;

public class RecursionInArrays {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(max(arr, 0));
		System.out.println(firstOccurenceIndex(arr, 0, 0));

	}

	private static int max(int[] arr, int vidx) {

		if (vidx == arr.length) {
			return Integer.MIN_VALUE;
		}

		int maxN = arr[vidx];
		int max1 = max(arr, vidx + 1);

		if (maxN < max1)
			maxN = max1;
		return maxN;

	}

	public static int firstOccurenceIndex(int[] arr, int item, int vidx) {

		if (vidx == arr.length) {
			return -1;
		}

		if (item == arr[vidx]) {
			return vidx;
		}

		return firstOccurenceIndex(arr, item, vidx + 1);
	}
	
	

}

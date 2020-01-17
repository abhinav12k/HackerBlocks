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
		System.out.println(lastOccurenceIndex1(arr, 0, 0));
		for (int val : findAllIndex(arr, 0, 0, 0)) {
			System.out.print(val + " ");
		}

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

	// method1
	public static int lastOccurenceIndex(int[] arr, int item, int vidx) {

		if (vidx == arr.length) {
			return -1;
		}

		int rr = lastOccurenceIndex(arr, item, vidx + 1);
		if (item == arr[vidx] && rr == -1) {
			return vidx;
		}
		return rr;
	}

	// method2
	public static int lastOccurenceIndex1(int[] arr, int item, int vidx) {

		if (vidx == arr.length) {
			return -1;
		}

		int index = lastOccurenceIndex1(arr, item, vidx + 1);
		if (index == -1) {

			if (arr[vidx] == item)
				return vidx;
			else
				return -1;

		} else
			return index;

	}

	// find all index
	public static int[] findAllIndex(int[] arr, int item, int vidx, int count) {

		if (vidx == arr.length) {
			int[] narray = new int[count];
			return narray;
		}

		int[] rr;
		if (arr[vidx] == item) {

			rr = findAllIndex(arr, item, vidx + 1, count + 1);
			rr[count] = vidx;
		} else {
			rr = findAllIndex(arr, item, vidx + 1, count);
		}

		return rr;
	}

}

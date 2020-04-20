package HackerBlocks.Arrays;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int[] sortedArray = mergeSort(arr, 0, arr.length - 1);
		for (int val : sortedArray) {
			System.out.println(val);
		}

	}

	public static int[] mergeSort(int[] arr, int lo, int hi) {

		if (lo == hi) {
			int[] ba = new int[1];
			ba[0] = arr[lo];
			return ba;
		}

		int mid = (lo + hi) / 2;
		int[] lh = mergeSort(arr, lo, mid);
		int[] rh = mergeSort(arr, mid + 1, hi);

		int[] combinedArray = mergeSortedArray(lh, rh);
		return combinedArray;

	}

	private static int[] mergeSortedArray(int[] larray, int[] rarray) {

		int[] mergedArray = new int[larray.length + rarray.length];

		int l1 = 0;
		int l2 = 0;
		int k = 0;

		while (l1 < larray.length && l2 < rarray.length) {
			if (larray[l1] <= rarray[l2]) {
				mergedArray[k] = larray[l1];
				l1++;
				k++;
			} else {
				mergedArray[k] = rarray[l2];
				l2++;
				k++;
			}
		}

		if (l1 == larray.length) {
			while (l2 < rarray.length) {
				mergedArray[k] = rarray[l2];
				l2++;
				k++;
			}
		}

		if (l2 == rarray.length) {
			while (l1 < larray.length) {
				mergedArray[k] = larray[l1];
				l1++;
				k++;
			}
		}

		return mergedArray;
	}
}

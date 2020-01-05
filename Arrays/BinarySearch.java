package HackerBlocks.Arrays;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int item = scn.nextInt();

		System.out.println(BinarySearch(arr, item));
	}

	private static int BinarySearch(int[] arr, int item) {

		int beg = 0;
		int end = arr.length - 1;

		while (beg <= end) {
			int mid = (beg + end) / 2;

			if (item > arr[mid]) {
				beg = mid + 1;
			} else if (item < arr[mid]) {
				end = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}

package HackerBlocks.Basics;

import java.util.Scanner;

public class ArraysLinearSearch {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int item = scn.nextInt();

		System.out.println(LinearSearch(arr, item));
	}

	private static int LinearSearch(int[] arr, int item) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == item) {
				return i;
			}
		}
		return -1;

	}

}

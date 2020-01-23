package HackerBlocks.Recursion;

import java.util.Scanner;

public class coinchangePermutation {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int target = scn.nextInt();

		coinpermutation(arr, target, "");

	}

	private static void coinpermutation(int[] arr, int target, String ans) {

		if (target == 0) {
			System.out.println(ans);
			return;
		}

		if (target < 0) {
			return;
		}

		for (int i = 0; i < arr.length; i++) {

			coinpermutation(arr, target - arr[i], ans + arr[i]);

		}

	}

}

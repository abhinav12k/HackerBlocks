package HackerBlocks.Recursion;

import java.util.Scanner;

public class CoinchangeCombination {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int target = scn.nextInt();

		coinCombination(arr, target, "", 0);

	}

	private static void coinCombination(int[] arr, int target, String ans, int currentPos) {

		if (target == 0) {
			System.out.println(ans);
			return;
		}

		if (target < 0) {
			return;
		}

		for (int i = currentPos; i < arr.length; i++) {

			coinCombination(arr, target - arr[i], ans + arr[i], i);

		}

	}

}

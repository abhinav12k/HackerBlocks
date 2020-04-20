package HackerBlocks.RecursionHackerBlocks;

import java.util.Scanner;

public class subsetProblem {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int target = scn.nextInt();

		subsetProblem(arr, target, 0, "");
		System.out.println();
		System.out.println(count);
	}

	static int count = 0;

	private static void subsetProblem(int[] arr, int target, int vidx, String ans) {

		if (target == 0) {
			System.out.print(ans + " ");
			count++;
			return;
		}

		if (target < 0) {
			return;
		}

		for (int i = vidx; i < arr.length; i++) {
			subsetProblem(arr, target - arr[i], i + 1, ans + arr[i] + " ");
		}

	}

}

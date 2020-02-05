package HackerBlocks.RecursionHackerBlocks;

import java.util.Scanner;

public class SplitArray {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		splitArray(arr, 0, 0, 0, "", "");
		System.out.println(count);
	}

	static int count = 0;

	private static void splitArray(int[] arr, int part1, int part2, int vidx, String left, String right) {

		if (vidx == arr.length) {
			if (part1 == part2) {
				System.out.println(left + " and " + right);
				count++;
			}
			return;
		}

		splitArray(arr, part1 + arr[vidx], part2, vidx + 1, left + arr[vidx] + " ", right);
		splitArray(arr, part1, part2 + arr[vidx], vidx + 1, left, right + arr[vidx] + " ");

	}

}

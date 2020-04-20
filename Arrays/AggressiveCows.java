package HackerBlocks.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int nos = scn.nextInt();
		int cows = scn.nextInt();

		int[] arr = new int[nos];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		Arrays.sort(arr);

		int ld = 0;
		int md = arr[arr.length - 1] - arr[0];
		int finalAns = 0;

		while (ld <= md) {

			int mid = (ld + md) / 2;
			if (isitPossible(cows, nos, arr, mid)) {
				finalAns = mid;
				ld = mid + 1;
			} else {
				md = mid - 1;
			}

		}
		System.out.println(finalAns);
	}

	private static boolean isitPossible(int cows, int nos, int[] arr, int mid) {

		int cowplaced = 1;
		int pos = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] - pos >= mid) {
				cowplaced++;
				pos = arr[i];
				if (cowplaced == cows) {
					return true;
				}
			}

		}

		return false;

	}

}

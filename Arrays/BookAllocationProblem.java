package HackerBlocks.Arrays;

import java.util.Scanner;

public class BookAllocationProblem {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();

		while (tc-- != 0) {

			int nob = scn.nextInt();
			int nos = scn.nextInt();
			int[] pages = new int[nob];
			int end = 0;

			// adding number of pages in accending order
			for (int i = 0; i < pages.length; i++) {
				pages[i] = scn.nextInt();
				end += pages[i];
			}
			int start = pages[pages.length - 1];
			System.out.println(binarySearchmaxPages(start, end, pages, nos));
		}

	}

	// application of binary search
	public static int binarySearchmaxPages(int start, int end, int[] pages, int nos) {

		int finalAns = 0;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (ifvalidConfig(pages, nos, mid)) {
				// true

				finalAns = mid;
				end = mid - 1;
			} else {
				// false

				start = mid + 1;
			}

		}
		return finalAns;
	}

	public static boolean ifvalidConfig(int[] pages, int nos, int ans) {

		int students = 1;
		int current_pages = 0;

		for (int i = 0; i < pages.length; i++) {

			if (pages[i] + current_pages > ans) {
				current_pages = pages[i];
				students++;
				if (students > nos) {
					return false;
				}

			} else {
				current_pages += pages[i];
			}
		}

		return true;
	}

}

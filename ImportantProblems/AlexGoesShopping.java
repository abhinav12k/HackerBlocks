package HackerBlocks.Arrays;

import java.util.Scanner;

public class AlexGoesShopping {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] price = new int[n];
		for (int i = 0; i < price.length; i++) {
			price[i] = scn.nextInt();
		}

		int q = scn.nextInt();
		while (q-- != 0) {
			int A = scn.nextInt();
			int k = scn.nextInt();
			int count = 0;

			for (int i = 0; i < price.length; i++) {

				if (A % price[i] == 0) {
					count++;
				}

			}
			if (count >= k) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

}

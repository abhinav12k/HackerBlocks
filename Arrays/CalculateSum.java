package HackerBlocks.Arrays;

import java.util.Scanner;

public class CalculateSum {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr = new int[size];
		int[] Narr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
			Narr[i] = arr[i];
		}

//		for(int j=0;j<arr.length;j++) {
//			System.out.print(arr[j]+" ");
//		}
//		for(int j=0;j<arr.length;j++) {
//			System.out.print(Narr[j]+" ");
//		}

//		System.out.println("---------------------");
//		for(int j=0;j<Narr.length;j++) {
//			System.out.print(Narr[j]+" ");
//		}

		int operations = scn.nextInt();
		while (operations-- != 0) {

			int x = scn.nextInt();
			if (x != 0) {
				arr = rotate(arr, x);
				for (int i = 0; i < Narr.length; i++) {
					Narr[i] += arr[i];
				}
				for (int i = 0; i < arr.length; i++) {
					arr[i] = Narr[i];
				}
			} else {
				for (int i = 0; i < arr.length; i++) {
					arr[i] += arr[i];
				}
			}

		}

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum % ((int) Math.pow(10, 9) + 7));

	}

	private static int[] rotate(int[] arr, int x) {

		int i = 0;

		for (int j = 0; j < x; j++) {

			int temp = arr[arr.length - 1];

			for (i = arr.length - 1; i > 0; i--) {

				arr[i] = arr[i - 1];

			}

			arr[0] = temp;

		}
		return arr;
	}

}

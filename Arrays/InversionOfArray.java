package HackerBlocks.Arrays;

import java.util.Scanner;

public class InversionOfArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int[] narr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			narr[arr[i]] = i;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(narr[i]);
		}
	}

}

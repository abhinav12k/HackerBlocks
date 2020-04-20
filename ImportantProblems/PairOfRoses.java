package HackerBlocks.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PairOfRoses {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();

		while (tc-- != 0) {
			int nor = scn.nextInt();
			int[] arr = new int[nor];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
			}

			int m = scn.nextInt();
			Arrays.sort(arr);
			
			int min=Integer.MAX_VALUE,rose1=0,rose2=0;
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] + arr[j] == m) {
						if(arr[j]-arr[i]<min) {
							rose1=arr[j];
							rose2=arr[i];
							min=arr[j]-arr[i];
						}
					}
				}

			}
			System.out.println("Deepak should buy roses whose prices are " + rose2 + " and " + rose1 + ".");
		}
	}
}

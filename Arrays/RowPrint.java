package HackerBlocks.Arrays;

import java.util.Scanner;

public class RowPrint {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int row = scn.nextInt();
		int col = scn.nextInt();

		int[][] arr = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = scn.nextInt();
			}
		}

		for (int i = 0; i < row; i++) {
			int j;
			if (i % 2 == 1) {
				j = arr[0].length-1;
				for (; j >= 0; j--) {
					System.out.print(arr[i][j] + ", ");
				}
			} else {
				j = 0;
				for (; j < col; j++) {
					System.out.print(arr[i][j] + ", ");
				}
			}
		}
		System.out.print("END");
	}

}

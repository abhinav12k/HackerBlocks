package HackerBlocks.Arrays;

import java.util.Scanner;

public class SpiralAnticlockwise {

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

		arrayspiralClockwise(arr);

	}

	private static void arrayspiralClockwise(int[][] arr) {

		int minRow = 0;
		int minCol = 0;
		int maxRow = arr.length - 1;
		int maxCol = arr[0].length - 1;

		int nel = arr.length * arr[0].length;
		int count = 0;

		while (count < nel) {

			// first col
			for (int i = minRow; i <= maxRow && count < nel; i++) {
				System.out.print(arr[i][minCol] + ", ");
				count++;
			}
			minCol++;

			// last row
			for (int i = minCol; i <= maxCol && count < nel; i++) {
				System.out.print(arr[maxRow][i] + ", ");
				count++;
			}
			maxRow--;

			// last col
			for (int i = maxRow; i >= minRow && count < nel; i--) {
				System.out.print(arr[i][maxCol] + ", ");
				count++;
			}
			maxCol--;

			// first row
			for (int i = maxCol; i >= minCol && count < nel; i--) {
				System.out.print(arr[minRow][i] + ", ");
				count++;
			}
			minRow++;

		}
		System.out.println("END");

	}

}

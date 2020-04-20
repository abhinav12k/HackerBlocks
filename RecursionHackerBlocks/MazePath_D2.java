package HackerBlocks.RecursionHackerBlocks;

import java.util.Scanner;

public class MazePath_D2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int rows = scn.nextInt();

		System.out.println(mazePath(rows, rows, 1, 1, ""));

	}

	public static int mazePath(int rowEnd, int colEnd, int currentRow, int currentCol, String ans) {
		int sum = 0;

		if (rowEnd == currentRow && colEnd == currentCol) {
			System.out.println(ans);
			return 1;
		}

		if (currentCol > colEnd || currentRow > rowEnd) {
			return 0;
		}


		// Vertical
		sum += mazePath(rowEnd, colEnd, currentRow + 1, currentCol, ans + "V");

		// horizontal
		sum += mazePath(rowEnd, colEnd, currentRow, currentCol + 1, ans + "H");

		if (currentRow == currentCol || currentRow + currentCol == rowEnd + 1) {
			// diagonal
			sum += mazePath(rowEnd, colEnd, currentRow + 1, currentCol + 1, ans + "D");
		}

		return sum;
	}

}

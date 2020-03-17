package HackerBlocks.RecursionHackerBlocks;

import java.util.Scanner;

public class MazePath_D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int rows = scn.nextInt();
		int cols = scn.nextInt();

		System.out.println(MazePathD(rows, cols, 1, 1, ""));

	}

	public static int MazePathD(int rowEnd, int colEnd, int currentRow, int currentCol, String ans) {

		int sum = 0;
		if (currentRow == rowEnd && currentCol == colEnd) {
			System.out.println(ans);
			return 1;
		}

		if (currentRow > rowEnd || currentCol > colEnd || currentRow < 0 || currentCol < 0) {
			return 0;
		}

		// Vertical
		sum += MazePathD(rowEnd, colEnd, currentRow + 1, currentCol, ans + "V");

		// Horizontal
		sum += MazePathD(rowEnd, colEnd, currentRow, currentCol + 1, ans + "H");

		// Diagonal
		sum += MazePathD(rowEnd, colEnd, currentRow + 1, currentCol + 1, ans + "D");

		return sum;
	}
}

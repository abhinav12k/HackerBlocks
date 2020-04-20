package HackerBlocks.Recursion;

import java.util.Scanner;

public class MazePathPrint {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int cr = scn.nextInt();
		int cc = scn.nextInt();
		int fr = scn.nextInt();
		int fc = scn.nextInt();

		MazePathPrint(cr, cc, fr, fc, "");

	}

	private static void MazePathPrint(int cr, int cc, int fr, int fc, String ans) {

		if (cc == fc && cr == fr) {
			System.out.println(ans);
			return;
		}

		if (cc > fc || cr > fr) {
			return;
		}

		// horizontal
		if (cc <= fc)
			MazePathPrint(cr, cc + 1, fr, fc, ans + "H");

		// vertical
		if (cr <= fr)
			MazePathPrint(cr + 1, cc, fr, fc, ans + "V");

	}

}

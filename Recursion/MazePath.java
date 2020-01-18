package HackerBlocks.Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePath {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int cc = scn.nextInt();
		int cr = scn.nextInt();
		int fc = scn.nextInt();
		int fr = scn.nextInt();

		System.out.println(mazePath(cr, cc, fr, fc));
	}

	private static ArrayList<String> mazePath(int cr, int cc, int fr, int fc) {

		if (cc == fc && cr == fr) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();

		// horizontal movement
		if (cc + 1 <= fc) {
			ArrayList<String> hr = mazePath(cr, cc + 1, fr, fc);
			for (String val : hr) {
				mr.add("H" + val);
			}

		}

		// vertical movement
		if (cr + 1 <= fr) {
			ArrayList<String> vr = mazePath(cr + 1, cc, fr, fc);
			for (String val : vr) {
				mr.add("V" + val);
			}

		}
		return mr;
	}

}

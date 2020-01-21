package HackerBlocks.Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class mazePathMM {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int cr = scn.nextInt();
		int cc = scn.nextInt();
		int fr = scn.nextInt();
		int fc = scn.nextInt();

		System.out.println(mazeMM(cr, cc, fr, fc));

	}

	private static ArrayList<String> mazeMM(int cr, int cc, int fr, int fc) {

		if (cc == fc && cr == fr) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		// my result
		ArrayList<String> mr = new ArrayList<>();

		for (int move = 1; move <= fr && move <= fc; move++) {
			// horizontal
			if (cc + 1 <= fc) {
				ArrayList<String> rrh = mazeMM(cr, cc + 1, fr, fc);
				for (String val : rrh) {
					mr.add("H" + move + val);
				}
			}

			// vertical
			if (cr + 1 <= fr) {
				ArrayList<String> rrv = mazeMM(cr + 1, cc, fr, fc);
				for (String val : rrv) {
					mr.add("V" + move + val);
				}
			}

			// diagonal
			if (cc + 1 <= fc && cr + 1 <= fc) {
				ArrayList<String> rrd = mazeMM(cr + 1, cc + 1, fr, fc);
				for (String val : rrd) {
					mr.add("D" + move + val);
				}
			}
		}
		return mr;
	}

}

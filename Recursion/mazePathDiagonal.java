package HackerBlocks.Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class mazePathDiagonal {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int cr = scn.nextInt();
		int cc = scn.nextInt();
		int fr = scn.nextInt();
		int fc = scn.nextInt();

		System.out.println(mazeDiag(cr, cc, fr, fc));

	}

	private static ArrayList<String> mazeDiag(int cr, int cc, int fr, int fc) {

		if (cc == fc && cr == fr) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		// myresult
		ArrayList<String> mr = new ArrayList<>();

		// horizontal
		if (cc + 1 <= fc) {
			ArrayList<String> rrh = mazeDiag(cr, cc + 1, fr, fc);
			for (String val : rrh) {
				mr.add("H" + val);
			}
		}

		// vertical
		if (cr + 1 <= fr) {
			ArrayList<String> rrv = mazeDiag(cr + 1, cc, fr, fc);
			for (String val : rrv) {
				mr.add("V" + val);
			}
		}

		// diagonal
		if (cc + 1 <= fc && cr + 1 <= fr) {
			ArrayList<String> rrd = mazeDiag(cr + 1, cc + 1, fr, fc);
			for (String val : rrd) {
				mr.add("D" + val);
			}
		}

		return mr;
	}
}

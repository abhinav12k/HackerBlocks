package HackerBlocks.Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class reachTheTarget {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int curr = scn.nextInt();
		int dest = scn.nextInt();

		System.out.println(reachThetarget(curr, dest));

	}

	private static ArrayList<String> reachThetarget(int curr, int dest) {

		if (curr == dest) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		if (curr > dest) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}

		// my result
		ArrayList<String> mr = new ArrayList<>();

		for (int dice = 1; dice <= 6; dice++) {
			ArrayList<String> rr = reachThetarget(curr + dice, dest);
			for (String val : rr) {
				mr.add(dice + val);
			}
		}

		return mr;

	}

}

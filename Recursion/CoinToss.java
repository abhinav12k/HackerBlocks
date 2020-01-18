package HackerBlocks.Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class CoinToss {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int not = scn.nextInt();

		System.out.println(coinToss(not));

	}

	private static ArrayList<String> coinToss(int not) {

		if (not == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		int leftTosses = not - 1;
		ArrayList<String> rr = coinToss(leftTosses);
		ArrayList<String> mr = new ArrayList<>();

		for (String val : rr) {
			mr.add("H" + val);
			mr.add("T" + val);
		}
		return mr;
	}

}

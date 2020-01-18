package HackerBlocks.Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.next();

		System.out.println(Permuatation(str));

	}

	private static ArrayList<String> Permuatation(String str) {

		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rr = Permuatation(ros);
		ArrayList<String> mr = new ArrayList<>();

		for (String val : rr) {
			for (int i = 0; i <= val.length(); i++) {
				String ans = val.substring(0, i) + ch + val.substring(i);
				mr.add(ans);
			}
		}
		return mr;
	}

}

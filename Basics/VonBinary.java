package HackerBlocks.Basics;

import java.util.Scanner;

public class VonBinary {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();

		while (tc-- != 0) {
			int bn = scn.nextInt();
			int rem = 0, dn = 0;
			int multiplier = 1;

			while (bn != 0) {

				rem = bn % 10;
				dn = dn + rem * multiplier;
				multiplier = multiplier * 2;
				bn = bn / 10;
			}

			System.out.println(dn);
		}
	}
}

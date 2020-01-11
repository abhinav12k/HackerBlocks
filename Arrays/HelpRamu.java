package HackerBlocks.Arrays;

import java.util.Scanner;

public class HelpRamu {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();

		while (tc-- != 0) {

			int c1 = scn.nextInt(); // one ride on some rickshaw or cab
			int c2 = scn.nextInt(); // unlimited number of rides on some rickshaw or on some cab
			int c3 = scn.nextInt(); // unlimited number of rides on all rickshaws or all cabs
			int c4 = scn.nextInt(); // unlimited number of rides on all rickshaws and cabs

			int nor = scn.nextInt();
			int noc = scn.nextInt();

			int[] ai = new int[nor];
			int[] bi = new int[noc];

			for (int i = 0; i < nor; i++)
				ai[i] = scn.nextInt();

			for (int i = 0; i < noc; i++)
				bi[i] = scn.nextInt();

			int costOfRikshaws = 0, costOfCars = 0, Totalcost = 0;
			for (int i = 0; i < nor; i++) {
				costOfRikshaws += Math.min(ai[i] * c1, c2);
			}
			costOfRikshaws = Math.min(costOfRikshaws, c3);

			for (int i = 0; i < noc; i++) {
				costOfCars += Math.min(bi[i] * c1, c2);
			}
			costOfCars = Math.min(costOfCars, c3);

			Totalcost = Math.min(costOfCars+ costOfRikshaws, c4);
			System.out.println(Totalcost);
		}

	}

}

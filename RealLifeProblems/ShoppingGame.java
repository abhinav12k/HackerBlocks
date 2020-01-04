package HackerBlocks.RealLifeProblems;

import java.util.Scanner;

public class ShoppingGame {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();

		// aayush -> odd times
		// harshit ->even times

		while (tc-- != 0) {
			int aayushLimit = scn.nextInt();
			int harshitLimit = scn.nextInt();
			int aayushSum = 1;
			int harshitSum = 2;
			int count = 1;
			while (true) {
				if (count % 2 == 1) {

					if (aayushSum + count <= aayushLimit) {
						aayushSum += count;
					} else {
						System.out.println("Harshit");
						break;
					}
				} else {
					if (harshitSum + count <= harshitLimit) {
						harshitSum += count;
					} else {
						System.out.println("Aayush");
						break;
					}
				}
				count++;
			}
		}

	}

}

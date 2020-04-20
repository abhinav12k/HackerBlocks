package HackerBlocks.Basics;

import java.util.Scanner;

public class SumOddEvenPlaces {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int num = scn.nextInt();

		int osum = 0, esum = 0;
		int rem = 0, flag = 1;

		while (num > 0) {
			rem = num % 10;

			if (flag % 2 == 1) {
				osum += rem;
			} else {
				esum += rem;
			}

			flag++;
			num=num/10;
		}

		System.out.println(osum);
		System.out.println(esum);

	}

}

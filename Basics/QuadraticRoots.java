package HackerBlocks.Basics;

import java.util.Scanner;

public class QuadraticRoots {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();

		int b = scn.nextInt();

		int c = scn.nextInt();

		int D = b * b - 4 * a * c;

		if (D > 0) {

			System.out.println("Real and Distinct");

			int x1 = (int) ((-b - Math.sqrt(D)) / (2 * a));

			int x2 = (int) ((-b + Math.sqrt(D)) / (2 * a));

			System.out.print(x1 + " " + x2);

		} else if (D == 0) {

			System.out.println("Real and Equal");

			int x1 = -b / (2 * a);

			System.out.print(x1 + " " + x1);

		} else {

			System.out.println("Imaginary");
		}

	}

}

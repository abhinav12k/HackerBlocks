package HackerBlocks.Basics;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char ch = 'a';

		while (ch != 'x' || ch != 'X') {
			ch = scn.next().charAt(0);
			if (ch == '+') {
				int n1 = scn.nextInt();
				int n2 = scn.nextInt();
				System.out.println(n1 + n2);
			} else if (ch == '-') {

				int n1 = scn.nextInt();
				int n2 = scn.nextInt();
				System.out.println(n1 - n2);
			} else if (ch == '*') {
				int n1 = scn.nextInt();
				int n2 = scn.nextInt();
				System.out.println(n1 * n2);
			} else if (ch == '/') {
				int n1 = scn.nextInt();
				int n2 = scn.nextInt();
				System.out.println(n1 / n2);
			} else if (ch == '%') {
				int n1 = scn.nextInt();
				int n2 = scn.nextInt();
				System.out.println(n1 % n2);
			} else if (ch == 'x' || ch == 'X') {
				break;
			} else {
				System.out.println("Invalid operation. Try again.");
			}
		}

	}
}

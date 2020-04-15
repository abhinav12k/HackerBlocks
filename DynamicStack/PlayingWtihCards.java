package HackerBlocks.DynamicStack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class PlayingWtihCards {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int q = scn.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		getCards(arr, q);

	}

	private static void getCards(int[] arr, int q) {

		ArrayList<Stack<Integer>> A = new ArrayList<Stack<Integer>>();
		ArrayList<Stack<Integer>> B = new ArrayList<Stack<Integer>>();

		for (int i = 1; i <= arr.length + 1; i++) {
			A.add(new Stack<Integer>());
			B.add(new Stack<Integer>());
		}

		for (int i = 0; i < arr.length; i++) {
			A.get(0).push(arr[i]);
		}

		for (int i = 1; i <= q; i++) {

			while (!A.get(i - 1).isEmpty()) {

				int item = A.get(i - 1).pop();
				int ithPrime = getIthPrime(i);
				if (item % ithPrime == 0) {
					B.get(i).push(item);
				} else {
					A.get(i).push(item);
				}
			}
		}
		for (int k = 1; k <= q; k++) {
			while (!B.get(k).isEmpty()) {
				System.out.println(B.get(k).pop());
			}
		}
		while (!A.get(q).isEmpty()) {
			System.out.println(A.get(q).pop());
		}

	}

	public static int getIthPrime(int i) {

		int num = 2;
		int count = 0;
		while (true) {
			if (checkPrime(num)) {
				count++;
			}
			if (count == i) {
				return num;
			}
			num++;
		}
	}

	public static boolean checkPrime(int i) {
		int k = 2;
		while (k * k <= i) {

			if (i % k == 0) {
				return false;
			}
			k++;
		}
		return true;
	}

}

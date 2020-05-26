package HackerBlocks.Stack;

import java.util.Scanner;
import java.util.Stack;

public class NextGreater {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();
		while (tc-- != 0) {
			int n = scn.nextInt();

			int[] arr = new int[n];

			for(int i=0;i<arr.length;i++) {
				arr[i]=scn.nextInt();
			}
			
			int[] newArr = getNextGreater(arr);
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i] + ", " + newArr[i]);
			}
		}
	}

	private static int[] getNextGreater(int[] arr) {

		Stack<Integer> stack = new Stack<Integer>();

		//storing array index in stack
		stack.push(0);
		int[] ans = new int[arr.length];
		for (int i = 1; i < arr.length; i++) {

			while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
				ans[stack.pop()] = arr[i];
			}
			stack.push(i);
		}
		while (!stack.isEmpty()) {
			ans[stack.pop()]=-1;
		}
		return ans;
	}

}

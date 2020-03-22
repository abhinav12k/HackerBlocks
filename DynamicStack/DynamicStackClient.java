package HackerBlocks.DynamicStack;

public class DynamicStackClient {

	public static void main(String[] args) throws Exception {

		DynamicStack ds = new DynamicStack();
		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		ds.push(50);
		ds.push(60);
		ds.push(70);
		ds.push(80);

//		ds.display();
//		System.out.println("---------------------");
//		displayReverse(ds);
//		System.out.println("---------------------");
//		actualReverse(ds, new DynamicStack());
//		ds.display();

//		int[] arr = { 50, 40, 30, 45, 15, 10, 60, 55 };
//		NextGreater(arr);
//		int[] newArr = NextGreater2(arr);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i] + "->" + newArr[i]);
//		}

		int[] stocks = { 50, 30, 10, 35, 70, 20, 5, 25, 30, 3 };
		int[] prices = stockSpan(stocks);
		for (int val : prices) {
			System.out.println(val);
		}
	}

	private static void displayReverse(DynamicStack ds) throws Exception {

		if (ds.isEmpty()) {
			return;
		}

		int temp = ds.pop();
		displayReverse(ds);
		ds.push(temp);
		System.out.print(ds.peek() + " ");
		return;
	}

	public static void actualReverse(DynamicStack ds, DynamicStack helper) throws Exception {

		if (ds.isEmpty()) {
			actualReverse1(ds, helper);
			return;
		}

		helper.push(ds.pop());
		actualReverse(ds, helper);

	}

	public static void actualReverse1(DynamicStack ds, DynamicStack helper) throws Exception {

		if (helper.isEmpty()) {
			return;
		}

		int temp = helper.pop();
		actualReverse1(ds, helper);
		ds.push(temp);

	}

	public static void NextGreater(int[] arr) throws Exception {
		DynamicStack stack = new DynamicStack();
		stack.push(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			while (!stack.isEmpty() && stack.peek() < arr[i]) {
				System.out.println(stack.pop() + "->" + arr[i]);
			}
			stack.push(arr[i]);
		}
		while (!stack.isEmpty()) {
			System.out.println(stack.pop() + "-> -1");
		}
	}

	public static int[] NextGreater2(int[] arr) throws Exception {

		DynamicStack stack = new DynamicStack();
		stack.push(0);
		int[] ans = new int[arr.length];

		for (int i = 1; i < arr.length; i++) {
			while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
				ans[stack.pop()] = arr[i];
			}
			stack.push(i);
		}
		while (!stack.isEmpty()) {
			ans[stack.pop()] = -1;
		}
		return ans;
	}

	public static int[] stockSpan(int[] arr) throws Exception {
		int[] ans = new int[arr.length];
		DynamicStack stack = new DynamicStack();

		for (int i = 0; i < arr.length; i++) {

			while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
				stack.pop();
			}
			if (!stack.isEmpty()) {
				ans[i] = i - stack.peek();
			} else {
				ans[i] = i + 1;
			}
			stack.push(i);	
			
		}
		return ans;
	}

}

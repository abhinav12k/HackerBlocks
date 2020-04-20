package HackerBlocks.Stack;

public class stack {

	protected int[] data;
	protected int tos;

	public stack() {
		this.data = new int[5];
		this.tos = -1;
	}

	public stack(int capacity) {
		this.data = new int[capacity];
		this.tos = -1;
	}

	public void push(int item) throws Exception {

		if (isFull()) {
			throw new Exception("Stack is Full");
		}

		tos++;
		data[tos] = item;
	}

	public int pop() throws Exception {

		if (isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		int temp = data[tos];
		data[tos] = 0;
		tos--;
		return temp;
	}

	public int peek() throws Exception {

		if (isEmpty()) {
			throw new Exception("Stack is Empty");
		}

		int temp = data[tos];
		return temp;
	}

	public boolean isEmpty() {
		return tos == -1;
	}

	public boolean isFull() {
		return tos == data.length - 1;
	}

	public int size() {
		return tos + 1;
	}

	public void display() {
		for (int i = tos; i >= 0; i--) {
			System.out.println(data[i]);
		}
	}

}

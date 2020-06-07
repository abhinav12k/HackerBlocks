package HackerBlocks.LinkedList;

public class LinkedList {

	private class Node {

		int data;
		Node next;

		private Node() {

		}

		private Node(int item) {
			this.data = item;
		}

	}

	private Node head;
	private Node tail;
	private int size;

	public boolean isEmpty() {
		return size == 0;
	}

	public int getFirst() throws Exception {
		if (size == 0) {
			throw new Exception("LL is Empty");
		}

		return head.data;
	}

	public int getLast() throws Exception {
		if (size == 0) {
			throw new Exception("LL is Empty");
		}
		return tail.data;
	}

	public int getAt(int idx) throws Exception {

		if (isEmpty()) {
			throw new Exception("LL is empty");
		}

		if (idx < 0 || idx >= size) {
			throw new Exception("Invalid Index");
		}

		Node nn = head;

		for (int i = 0; i < idx; i++) {
			nn = nn.next;
		}
		return nn.data;
	}

	public Node getNodeAt(int idx) throws Exception {

		if (isEmpty()) {
			throw new Exception("LL is Empty");
		}

		Node nn = new Node();
		nn = head;
		for (int i = 0; i < idx; i++) {
			nn = nn.next;
		}
		return nn;
	}

	public void addFirst(int item) {

		// create a new node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		// attach
		nn.next = head;

		// data members
		if (size == 0) {
			head = tail = nn;
			size++;
		} else {
			head = nn;
			size++;
		}
	}

	public void addLast(int item) {
		// create a new node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		// attach
		if (size > 0)
			tail.next = nn;

		// data members
		if (size == 0) {
			head = tail = nn;
			size++;
		} else {
			tail = nn;
			size++;
		}
	}

	public void addAt(int item, int idx) throws Exception {

		if (idx < 0 || idx > size) {
			throw new Exception("Invalid index");
		}

		Node nn = new Node();
		nn.data = item;

		if (idx == 0) {
			addFirst(item);
		} else if (idx == size - 1) {
			addLast(item);
		} else {
			Node nn1 = getNodeAt(idx - 1);
			nn.next = nn1.next;
			nn1.next = nn;
			size++;
		}

	}

	public void display() {

		System.out.println("***********************");
		Node nn = head;
		while (nn != null) {
			System.out.print(nn.data + " ");
			nn = nn.next;
		}
		System.out.println();
		System.out.println("************************");
	}

	public int removeFirst() throws Exception {

		if (isEmpty()) {
			throw new Exception("LL is Empty");
		}

		int temp = head.data;

		if (size == 1) {
			head = tail = null;
			size--;
		} else {
			head = head.next;
			size--;
		}
		return temp;
	}

	public int removeLast() throws Exception {

		if (size == 0) {
			throw new Exception("LL is Empty.");
		}

		int temp = tail.data;

		if (size == 1) {
			head = tail = null;
			size--;
		} else {
			tail = getNodeAt(size - 2);
			tail.next = null;
			size--;
		}

		return temp;
	}

	public int removeAt(int idx) throws Exception {

		if (size == 0) {
			throw new Exception("LL is Empty.");
		}

		if (idx < 0 || idx >= size) {
			throw new Exception("Invalid Index.");
		}

		if (idx == 0) {
			return removeFirst();
		} else if (idx == size - 1) {
			return removeLast();
		} else {

			Node nm1 = getNodeAt(idx - 1);
			Node n = nm1.next;
			Node np1 = n.next;

			nm1.next = np1;
			size--;

			return n.data;

		}
	}

	public void reverseDataIteratively() throws Exception {

		int left = 0;
		int right = size - 1;

		while (left <= right) {

			Node leftNode = getNodeAt(left);
			Node rightNode = getNodeAt(right);

			int temp = leftNode.data;

			leftNode.data = rightNode.data;
			rightNode.data = temp;

			left++;
			right--;
		}
	}

	public void reversePointerIteratively() {

		Node prev = head;
		Node curr = head.next;

		while (curr != null) {

			Node ahead = curr.next;
			curr.next = prev;

			prev = curr;
			curr = ahead;
		}

		Node temp = head;
		head = tail;
		tail = temp;
		tail.next = null;

	}

	public void RPR() {

		reversePointerRecursively(head, head.next);
		Node temp = head;
		head = tail;
		tail = temp;
		tail.next = null;

	}

	private void reversePointerRecursively(Node prev, Node curr) {

		if (curr == null) {
			return;
		}

		reversePointerRecursively(curr, curr.next);
		curr.next = prev;
	}

	public void RDR() {
		reverseDataRecursively(head, head, 0);
	}

	private Node reverseDataRecursively(Node left, Node right, int count) {

		if (right == null) {
			return left;
		}

		Node ln = reverseDataRecursively(left, right.next, count + 1);

		if (count >= size / 2) {
			int temp = ln.data;
			ln.data = right.data;
			right.data = temp;
		}

		return ln.next;
	}

	public void RDRHeap() {
		Heapmover hp = new Heapmover();
		hp.left = head;
		ReverseDataRecursivelyHeap(hp, head, 0);
	}

	public class Heapmover {
		public Node left;
	}

	private void ReverseDataRecursivelyHeap(Heapmover hp, Node right, int count) {

		if (right == null) {
			return;
		}

		ReverseDataRecursivelyHeap(hp, right.next, count + 1);

		if (count >= size / 2) {
			int temp = hp.left.data;
			hp.left.data = right.data;
			right.data = temp;
		}

		hp.left = hp.left.next;
	}

	public void fold() {
		fold(head, head, 0);
	}

	private Node fold(Node left, Node right, int count) {

		if (right == null) {
			return left;
		}

		left = fold(left, right.next, count + 1);

		if (count > size / 2) {
			Node ahead = left.next;
			left.next = right;
			right.next = ahead;
			return ahead;
		}

		if (count == size / 2) {

			tail = right;
			tail.next = null;

		}

		return null;
	}

}

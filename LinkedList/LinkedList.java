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

	public int mid() {

		Node slow = head;
		Node fast = head;

		while (fast.next != null && fast.next.next != null) {

			slow = slow.next;
			fast = fast.next.next;

		}

		return slow.data;
	}

	public int kthFromLast(int k) {

		Node slow = head;
		Node fast = head;

		for (int i = 1; i < k; i++) {
			fast = fast.next;
		}

		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}

		return slow.data;
	}

	public int linkedListIntersection() {

		Node a1 = new Node(10);
		Node a2 = new Node(20);
		Node a3 = new Node(30);
		Node a4 = new Node(40);
		Node a5 = new Node(50);
		Node a6 = new Node(60);
		Node b1 = new Node(70);
		Node b2 = new Node(80);
		Node b3 = new Node(90);
		Node b4 = new Node(100);
		Node b5 = new Node(110);
		Node b6 = new Node(120);
		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;
		a5.next = a6;
		b1.next = b2;
		b2.next = b3;
		b3.next = b4;
		b4.next = b5;
		b5.next = b6;
		b6.next = a3;

		/*-----LOGIC------*/

		Node fp = a1;
		Node sp = b1;

		while (fp != sp) {

			if (fp == null) {
				fp = b1;
			} else {
				fp = fp.next;
			}

			if (sp == null) {
				sp = a1;
			} else {
				sp = sp.next;
			}

		}
		return fp.data;

	}

	public void createDummyList() {
		Node a1 = new Node(10);
		Node a2 = new Node(20);
		Node a3 = new Node(30);
		Node a4 = new Node(40);
		Node a5 = new Node(50);
		Node a6 = new Node(60);
		Node a7 = new Node(70);
		Node a8 = new Node(80);
		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;
		a5.next = a6;
		a6.next = a7;
		a7.next = a8;
		a8.next = a3;
		head = a1;
	}

	public boolean detectLoop() {

		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {

			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				break;
			}

		}

		if (slow == fast) {
			return true;
		} else {
			return false;
		}

	}

	public boolean detectLoopNremove() {

		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {

			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				break;
			}

		}

		if (fast == slow) {
			Node start = head;
			Node temp = slow;
			while (start.next != temp.next) {

				start = start.next;
				temp = temp.next;

			}
			temp.next = null;
			return true;
		} else {
			return false;
		}

	}

	public void kReverse(int k) throws Exception {

		LinkedList prev = null;

		while (size != 0) {

			LinkedList curr = new LinkedList();

			for (int i = 1; i <= k && size > 0; i++) {

				curr.addFirst(this.removeFirst());

			}

			if (prev == null) {
				prev = curr;
			} else {

				prev.tail.next = curr.head;
				prev.size += curr.size;
				prev.tail = curr.tail;
			}

		}

		this.head = prev.head;
		this.tail = prev.tail;
		this.size = prev.size;
		this.tail.next = null;
		
		this.display();
	}

}

package HackerBlocks.LinkedList;

public class LinkedListClient {

	public static void main(String[] args) throws Exception {

		LinkedList ll = new LinkedList();

		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		ll.addLast(50);
		ll.display();

//		ll.removeLast();
//		ll.display();

//		ll.addLast(100);
//		ll.display();

//		ll.addFirst(0);
//		ll.display();

//		ll.addLast(100);
//		ll.addLast(26);
//		System.out.println(ll.getAt(2));
//		ll.addAt(500, 4);
//		ll.addLast(2000);
//		ll.display();

//		System.out.println(ll.getAt(2));

		ll.reverseDataIteratively();
		ll.display();

		ll.reversePointerIteratively();
		ll.display();
		
	}

}

package HackerBlocks.DynamicQueue;

public class DynamicQueueClient {

	public static void main(String[] args) throws Exception {

		DynamicQueue queue = new DynamicQueue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.display();

		System.out.println();
		// Reverse Display
		System.out.println("*********Reverse Display*********");
		ReverseDisplay(queue, 0);
		System.out.println();
		queue.display();

		System.out.println();
		// Actual Reverse
		System.out.println("**********Actual Reverse**********");
		ActualReverse(queue);
		System.out.println();
		queue.display();

	}

	private static void ActualReverse(DynamicQueue queue) throws Exception {
		// TODO Auto-generated method stub

		if (queue.isEmpty()) {
			return;
		}

		int temp = queue.dequeue();
		ActualReverse(queue);
		System.out.print(temp+" ");
		queue.enqueue(temp);
	}

	private static void ReverseDisplay(DynamicQueue queue, int count) throws Exception {
		// TODO Auto-generated method stub

		if (count == queue.size()) {
			return;
		}

		int temp = queue.dequeue();
		queue.enqueue(temp);
		ReverseDisplay(queue, count + 1);
		System.out.print(temp + " ");
	}

}

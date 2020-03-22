package HackerBlocks.DynamicQueue;

import HackerBlocks.Queue.Queue;

public class DynamicQueue extends Queue{

	@Override
	public void enqueue(int item) throws Exception {
		
		if(isFull()) {
			int[] newArray = new int[data.length*2];
			for(int i=0;i<size();i++) {
				newArray[i]=data[(front+i)%data.length];
			}
			data=newArray;
			front=0;
		}
		
		super.enqueue(item);
	}
	
}

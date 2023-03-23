package Queue;

public class QueueUsingArray {
	
	private int data[];
	private int front;
	private int rear;
	
	public QueueUsingArray() {
		data=new int[5];
		front=-1;
		rear=-1;
	}
	
	public int size() {
		if(front==-1) {
			return 0;
		}
		else {
			return rear-front+1;
		}
	}
	
	public boolean isEmpty() {
		if(size()==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public int frontElement() throws QueueEmptyException {
		if(size()==0) {
			throw new QueueEmptyException();
		}
		return data[front];
	}
	
	public int rearElement() {
		return data[rear];
	}
	
	public void enqueue(int no) {
		if(rear==-1) {
			front=front+1;
		}
		rear=rear+1;
		data[rear]=no;
	}
	
	public void dequeue() throws QueueEmptyException {
		if(size()==0) {
			throw new QueueEmptyException();
		}
		front=front+1;
	}
	
	public void displayQueue() {
		for(int i=front;i<=rear;i++) {
			System.out.println(data[i]);
		}
	}
	
}

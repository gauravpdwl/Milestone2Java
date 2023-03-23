package Queue;

public class QueueUse {

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		QueueUsingArray q=new QueueUsingArray();
		System.out.println(q.size());
		
		System.out.println(q.isEmpty());
		try {
			System.out.println(q.frontElement());
		} catch (QueueEmptyException e) {
			// TODO Auto-generated catch block
			System.out.println("Queue is Empty");
//			e.printStackTrace();
		}
		
		//System.out.println("Front Element - "+q.frontElement());
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.displayQueue();
		System.out.println(q.isEmpty());
		
		q.dequeue();
		q.dequeue();
		q.displayQueue();
		
		System.out.println("Front Element - "+q.frontElement());
	}

}

package StackDS;

public class StackUse {
	public static void main(String args[]) {
		
//		StackUsingArray s=new StackUsingArray();		
//		s.top();
//		s.push(1);
//		s.top();
//		s.push(2);
//		s.top();
//		s.push(3);
//		s.top();
//		System.out.println("pop-"+s.pop());
//		s.top();
//		System.out.println("pop-"+s.pop());
//		s.top();
//		System.out.println(s.isEmpty());
		
		StackUsingLinkedList<Integer> s=new StackUsingLinkedList<>();
		System.out.println(s.top());
		s.push(10);
		System.out.println(s.top());
		s.push(20);
		System.out.println(s.top());
		s.push(30);
		System.out.println(s.top());
		s.push(40);
		System.out.println(s.top());
		System.out.println("Pop-"+s.pop());
		System.out.println(s.top());
		System.out.println("Size-"+s.getSize());
		System.out.println("Is Empty-"+s.isEmpty());
		System.out.println("Pop-"+s.pop());
		System.out.println(s.top());
		System.out.println("Pop-"+s.pop());
		System.out.println(s.top());
		System.out.println("Pop-"+s.pop());
		System.out.println(s.top());
		System.out.println("Size-"+s.getSize());
		System.out.println("Is Empty-"+s.isEmpty());
		
		
	}
}

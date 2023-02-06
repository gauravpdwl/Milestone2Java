package LinkedListPackage;

public class LoopCheckUse {
	public static void main(String args[]) {
		Node<Integer> n1=new Node<Integer>(10);
		Node<Integer> n2=new Node<Integer>(10);
		Node<Integer> n3=new Node<Integer>(20);
		Node<Integer> n4=new Node<Integer>(10);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		Node<Integer> head=n1;
		
		RemoveConsecutiveDuplicates lp=new RemoveConsecutiveDuplicates();
		head=lp.removeDuplicate(head);
		
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
}

package LinkedListPackage;

public class Merge2SortedLL {
	public static Node<Integer> merge2SortedLL(Node<Integer> l1,Node<Integer> l2){
		
		Node<Integer> head,tail;
		
		if(l1==null) {
			return l2;
		}
		
		if(l2==null) {
			return l1;
		}
		
		if(l1.data<l2.data) {
			head=l1;
			tail=l1;
			l1=l1.next;
		}else {
			head=l2;
			tail=l2;
			l2=l2.next;
		}
		
		while(l1!=null && l2!=null) {
			if(l1.data<l2.data) {
				tail.next=l1;
				l1=l1.next;
				tail=tail.next;
			}else {
				tail.next=l2;
				l2=l2.next;
				tail=tail.next;
			}
		}
		
		while(l1!=null) {
			tail.next=l1;
			l1=l1.next;
			tail=tail.next;
		}
		
		while(l2!=null) {
			tail.next=l2;
			l2=l2.next;
			tail=tail.next;
		}
		
		return head;
	}
	
}

package LinkedListPackage;

public class ReverseLinkedList {
	public static Node<Integer> reverseLinkedList(Node<Integer> head) {
		
		Node<Integer> prev = null;
		Node<Integer> current = head;
		Node<Integer> next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
	}
	
	public static void main(String args[]) {
		Node<Integer> head=new Node<Integer>(5);
		Node<Integer> n2=new Node<Integer>(4);
		Node<Integer> n3=new Node<Integer>(3);
		Node<Integer> n4=new Node<Integer>(2);
		
		head.next=n2;
		n2.next=n3;
		n3.next=n4;
		
		displayLinkedList(head);
		head=reverseLinkedList(head);
		displayLinkedList(head);
	}

	private static void displayLinkedList(Node<Integer> head) {
		// TODO Auto-generated method stub
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
}

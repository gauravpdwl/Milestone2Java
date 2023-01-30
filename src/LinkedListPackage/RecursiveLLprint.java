package LinkedListPackage;

public class RecursiveLLprint {
	
	public static void rprint(Node<Integer> head) {
		if(head==null) {
			return;
		}
		rprint(head.next);
		System.out.println(head.data);
	}
	
	public static Node<Integer> rinsert(Node<Integer> head, int ele, int pos){
		//Insert element in list recursively
		if(head==null) {
			return head;
		}
		
		if(pos==0) {
			Node<Integer> node=new Node<Integer>(ele);
			node.next=head;
			head=node;
			return head;
		}
		
		if(pos==1) {
			Node<Integer> node=new Node<Integer>(ele);
			Node<Integer> temp;
			temp=head.next;
			head.next=node;
			node.next=temp;
			return head;
		}
		
		rinsert(head.next, ele, pos-1);
		return head;
	}
	
	public static Node<Integer> rdelete(Node<Integer> head, int pos){
		
		if(head==null) {
			return head;
		}
		
		if(pos==0) {
			head=head.next;
			return head;
		}
		
		if(pos==1) {
			if(head.next==null) {
				head=head.next;
			}else {
				head.next=head.next.next;
			}
			
			return head;
		}
		rdelete(head.next,pos-1);
		return head;
	}
	
	public static Node<Integer> reverseLL(Node<Integer> head){
		if(head==null) {
			return null;
		}
		
		if(head.next==null) {
			return head;
		}
		
		Node<Integer> rhead=reverseLL(head.next);
		Node<Integer> temp=rhead;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=head;
		head.next=null;
		head=rhead;
		return head;
	}
	
	public static DoublePointer reverseLLBetterVersion(Node<Integer> head) {
		DoublePointer p;
		if(head==null || head.next==null) {
			p=new DoublePointer();
			p.head=head;
			p.tail=head;
			return p;
		}
		
		DoublePointer q=reverseLLBetterVersion(head.next);
		q.tail.next=head;
		head.next=null;
		p=new DoublePointer();
		p.head=q.head;
		p.tail=head;
		
		return p;	
	}
	
	public static Node<Integer> reverseLLBestVersion(Node<Integer> head){
		
		if(head==null) {
			return null;
		}
		
		if(head.next==null) {
			return head;
		}
		
		Node<Integer> rhead=reverseLLBestVersion(head.next);
		Node<Integer> tailnode=head.next;
		tailnode.next=head;
		head.next=null;
		head=rhead;
		
		return head;
		
	}
	
	public static Node<Integer> midPoint(Node<Integer> head){
		
		Node<Integer> snode=head;
		Node<Integer> bnode=head;
		
		while(bnode.next!=null && bnode.next.next!=null) {
			snode=snode.next;
			//System.out.println(snode.data);
			bnode=bnode.next.next;
		}
		
		
		return snode;
	}
	
}









package StackDS;

public class StackUsingLinkedList<T> {
	private Node<T> head;
	private int size;
	
	public StackUsingLinkedList() {
		head=null;
		size=0;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public void push(T data) {
		Node<T> newnode=new Node<T>(data);
		newnode.next=head;
		head=newnode;
		size++;
	}
	
	public T pop(){
		T temp=head.data;
		head=head.next;
		size--;
		return temp;
	}
	
	public T top() {
		if(head!=null) {
			return head.data;
		}
		return null;
	}
	
}

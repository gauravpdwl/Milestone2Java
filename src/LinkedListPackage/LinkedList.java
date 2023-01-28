package LinkedListPackage;
import java.util.Scanner;

public class LinkedList {
	
	public static Node<Integer> createLinkedList() {
		
		Node<Integer> n1=new Node<Integer>(10);
		Node<Integer> n2=new Node<Integer>(20);
		Node<Integer> n3=new Node<Integer>(30);
		Node<Integer> n4=new Node<Integer>(40);
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		
		return n1;
	}
	
	public static Node<Integer> takeInput(){
		
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		Node<Integer> head=null;
		
		while(data!=-1) {
			Node<Integer> currentNode=new Node<Integer>(data);
			if(head==null) {
				head=currentNode;
			}else {
				Node<Integer> tail=head;
				while(tail.next!=null) {
					tail=tail.next;
				}
				tail.next=currentNode;
			}
			data=sc.nextInt();
		}
		
		return head;
	}
	
public static Node<Integer> takeInputBetterVersion(){
		
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		Node<Integer> head=null, tail=null;
		
		while(data!=-1) {
			Node<Integer> currentNode=new Node<Integer>(data);
			if(head==null) {
				head=currentNode;
				tail=currentNode;
			}else {
				tail.next=currentNode;
				tail=currentNode;
			}
			data=sc.nextInt();
		}
		
		return head;
	}
	
	public static void main(String args[]) {
		
		Node<Integer> head=takeInputBetterVersion();
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
		
	}
}


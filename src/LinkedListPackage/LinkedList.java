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
//		Node<Integer> temp=head;
//		while(head!=null) {
//			System.out.println(head.data);
//			head=head.next;
//		}
		//print list in reverse order using recursion
		//RecursiveLLprint.rprint(head);
		
		//remove "head=" part from below line and you will see that
		//it is passed by value and not reference
		
		//insert element in list using recursion
		//head=RecursiveLLprint.rinsert(head, 11, 0);
		
		//delete element of ith position from list using recursion
		//head=RecursiveLLprint.rdelete(head, 4);
		
		//reverse Linked List using recursion
		//head=RecursiveLLprint.reverseLL(head);
		
		//reverse linked list better version
		//DoublePointer pp=new DoublePointer();
		//pp=RecursiveLLprint.reverseLLBetterVersion(head);
		//head=pp.head;
		
		//reverse linked list BEST VERSION
		//head=RecursiveLLprint.reverseLLBestVersion(head);
		
		//find midnode
		//head=RecursiveLLprint.midPoint(head);
		
		//merge 2 sorted list 
		//Node<Integer> l1=takeInputBetterVersion();
		//Node<Integer> l2=takeInputBetterVersion();
		//Node<Integer> head=Merge2SortedLL.merge2SortedLL(l1, l2);
		
		//Merge sort using Linked List
		head=MergeSortLL.mergeSort(head);
		
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
}


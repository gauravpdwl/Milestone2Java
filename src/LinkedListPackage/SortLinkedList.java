package LinkedListPackage;
import java.util.Scanner;


//class LinkedListNode<T> {
//	T data;
//	LinkedListNode<T> next;
//	
//	public LinkedListNode(T data) {
//		this.data = data;
//		this.next = null;
//	}
//}

public class SortLinkedList {
	
	public static LinkedListNode<Integer> takeInput(Scanner s) {
		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		
		int data = s.nextInt();
		
		while(data != -1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<>(data);
			
			if(head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}

	public static void printList(LinkedListNode<Integer> head) {
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		
		// System.out.println("null");
		System.out.println();
		return;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		LinkedListNode<Integer> head = takeInput(s);
		s.close();

		printList(Solution.sort(head));

	}
	
	
}

class Solution {

	public static LinkedListNode<Integer> sort(LinkedListNode<Integer> head) {
		//Your code goes here
		if(head==null || head.next==null){
			return head;
		}
		
		LinkedListNode<Integer> temp=head;
		LinkedListNode<Integer> rhead=sort(head.next);
		LinkedListNode<Integer> prev=null,point=rhead,hhead=rhead, printer=rhead;
		
		if(point.next==null) {
			if(temp.data<=point.data) {
				temp.next=point;
				hhead=temp;
				return hhead;
			}else {
				point.next=temp;
				hhead=point;
				temp.next=null;
				return hhead;
			}
		}
		while(point!=null) {
			if(temp.data<=point.data && prev==null) {
				temp.next=point;
				hhead=temp;
				break;
			}
			
			if(temp.data<=point.data && prev!=null) {
				prev.next=temp;
				temp.next=point;
				break;
			}
			
			prev=point;
			point=point.next;
			
			if(point==null) {
				prev.next=temp;
				temp.next=point;
			}
			
		}
		
		return hhead;
		
		/*Another Solution Below*/
		
		}
		
	}


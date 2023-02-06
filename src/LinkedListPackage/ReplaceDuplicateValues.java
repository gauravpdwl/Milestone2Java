package LinkedListPackage;

import java.util.Scanner;

class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
		this.next = null;
	}
}

public class ReplaceDuplicateValues {
	private static Scanner s = new Scanner(System.in);

	public static LinkedListNode<Integer> input() {
		int data = s.nextInt();

		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		while (data != -1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			if (head == null) {
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

	public static void print(LinkedListNode<Integer> head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		LinkedListNode<Integer> head = input();
		solution.changeLL(head);
		print(head);
	}
	
	class solution {

		public static void changeLL(LinkedListNode<Integer> head) {
			// Write your code here
			LinkedListNode<Integer> temp=head;
			int max=findMax(head);
			int arr[]=new int[max+1];
			
			while(temp!=null) {
				arr[temp.data]=arr[temp.data]+1;
				if(arr[temp.data]>1) {
					temp.data=max+1;
					max++;
				}
				temp=temp.next;
			}
			
			
			
		}
		
		public static int findMax(LinkedListNode<Integer> head) {
			int max=0;
			
			while(head!=null) {
				if(max<head.data) {
					max=head.data;
				}
				head=head.next;
			}
			
			return max;
		}
	}
}
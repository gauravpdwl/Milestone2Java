package StackDS;

public class StackUsingArray {
	private int data[];
	private int topIndex;
	
	public StackUsingArray() {
		data=new int[10];
		topIndex=-1;
	}
	
	public void push(int info) {
		topIndex++;
		data[topIndex]=info;
		
	}
	
	public int pop() {
		
		return data[topIndex--];
		
	}
	
	public boolean isEmpty() {
		return topIndex==-1;
	}
	
	public void top() {
		if(topIndex==-1) {
			System.out.println("Stack is Empty!");
		}else {
			System.out.println("Top of Stack is - "+data[topIndex]);
		}
	}
}

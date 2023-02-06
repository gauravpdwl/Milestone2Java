package StackDS;
import java.util.LinkedList;
import java.util.Stack;

public class ReverseStack {
	public static void main(String args[]) {
		Stack<Integer> stk=new Stack<Integer>();
		Stack<Integer> extra=new Stack<Integer>();
		stk.push(10);
		stk.push(20);
		stk.push(30);
		stk.push(40);
		stk.push(50);
		reverseStack(stk, extra);
		while(!stk.isEmpty()) {
			System.out.println(stk.peek());
			stk.pop();
		}
	}
	
	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		if(input.size()<=1) {
			return;
		}
		
		int temp=input.pop();
		reverseStack(input, extra);
		while(!input.isEmpty()) {
			int a=input.pop();
			extra.push(a);
		}
		input.push(temp);
		
		while(!extra.isEmpty()) {
			int b=extra.pop();
			input.push(b);
		}
		
	}
}

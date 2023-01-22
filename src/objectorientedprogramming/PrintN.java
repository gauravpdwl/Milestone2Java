package objectorientedprogramming;

public class PrintN {
	public static void main(String args[]) {
		display(5);
	}
	
	public static void display(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		display(n-1);
		
	}
}



package Milestone2JavaCodes;

public class FactorialUsingRecursion {
	
	public static int fact(int n) {
		
		if(n==0) {
			return 1;
		}
		int subfact=fact(n-1);
		int factvalue=n*subfact;
		
		return factvalue;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));
	}

}

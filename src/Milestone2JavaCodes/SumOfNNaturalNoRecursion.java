package Milestone2JavaCodes;

public class SumOfNNaturalNoRecursion {
	
	public static int nsum(int n) {
		if(n==1) {
			return 1;
		}
		int subsum=nsum(n-1);
		return n+subsum;
	}
	
	public static void main(String args[]) {
		System.out.println(nsum(1));
	}
}


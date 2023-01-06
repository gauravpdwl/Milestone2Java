package Milestone2JavaCodes;

public class FibonacciSeriesUsingRecursion {
	
	public static int fibo(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		
		int temp=fibo(n-1)+fibo(n-2);
		return temp;
	}
	
	public static void main(String []args) {
		for(int i=0;i<10;i++) {
			System.out.println(fibo(i));
		}
	}
}

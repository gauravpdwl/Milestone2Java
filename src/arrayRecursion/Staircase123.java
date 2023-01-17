package arrayRecursion;

public class Staircase123 {
	public static void main(String args[]) {
		
		int no=5;
		staircase(no);
		
	}
	
	public static void staircase(int steps) {
		int a=steps;
		int b=steps/2;
		int c=steps/3;
		int count=1;
		int sum=0;
		
		System.out.println("One - "+a);
		System.out.println("Two - "+b);
		System.out.println("Three - "+c);
		
		for(int i=0;i<b;i++) {
			sum=sum+2;
		}
		if(sum==steps) {
			count++;
			b--;
		}
		
		sum=0;
		for(int i=0;i<c;i++) {
			sum=sum+3;
		}
		if(sum==steps) {
			count++;
			c--;
		}
		
		sum=0;
		for(int i=b;i>0;i--) {
			
		}
		
		
		
	System.out.println("Number of ways - "+count);
	}
	
	public static int per(int a,int b) {
		
		int fact=factorial(a+b)/(factorial(a)*factorial(b));
		return fact;
	}
	
	public static int perm(int a,int b,int c) {
		
		int fact=factorial(a+b+c)/(factorial(a)*factorial(b)*factorial(c));
		return fact;
	}

	public static int factorial(int i) {
		if(i==0) {
			return 1;
		}
		
		return i*factorial(i-1);
	}
}

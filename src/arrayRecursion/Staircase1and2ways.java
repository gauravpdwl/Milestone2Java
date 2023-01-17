package arrayRecursion;

public class Staircase1and2ways {
	public static void main(String args[]) {
		//Select total no of steps below
		int steps=4;
		
		int a=steps;  //How many one's are possible
		int b=steps/2; //How many two's are possible
		
		System.out.println(a);
		System.out.println(b);
		
		int count=1; //selecting count 1 because all one's are always equal to steps
		int sum=0;
		
		while(b>0) {
			
			//for different b's how many ways to complete steps
			
			for(int i=0;i<b;i++) {
				sum=sum+2;
			}
			
			if(sum==steps) {
				count++;
				b--;
				sum=0;
			} 
			if(sum<steps) {
				int ano=steps-sum;
				if(ano<a) {
					count=count+per(ano,b);
					b--;
					sum=0;
				}
			}
			
		}
		
		System.out.println("Different ways to climb stairs - "+count);
		
	}
	
	public static int per(int a,int b) {
		
		int fact=factorial(a+b)/(factorial(a)*factorial(b));
		
		return fact;
	}

	public static int factorial(int i) {
		if(i==0) {
			return 1;
		}
		
		return i*factorial(i-1);
	}
}


















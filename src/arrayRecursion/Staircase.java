package arrayRecursion;

public class Staircase {
	public static void main(String args[]) {
		int steps=10;
		
		int a=steps;
		int b=steps/2;
		
		System.out.println(a);
		System.out.println(b);
		
		int count=1;
		int sum=0;
		
		while(b>0) {
			for(int i=0;i<b;i++) {
				sum=sum+2;
			}
			
			if(sum==steps) {
				count++;
				b--;
				sum=0;
			}else if(sum<steps) {
				int ano=steps-sum;
				if(ano<a) {
					count=count+ano+b;
					b--;
					sum=0;
				}
			}
			
		}
		
		System.out.println("Count of different ways to climb stairs - "+count);
		
	}
}

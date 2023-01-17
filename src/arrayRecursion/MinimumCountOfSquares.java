package arrayRecursion;

import java.util.Scanner;


public class MinimumCountOfSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
			int num = s.nextInt();
			System.out.println(Solution.minCount(num));
	}
	
	public class Solution {
		
		public static int minCount(int n){
			
			int count=Integer.MAX_VALUE;
			int temp_n=n;
			int sum=0;
			for(int i=1;i<=n/2;i++) {
				boolean b=false;
				int temp_count=0;
				int j=i;
				sum=sum + j*j;
				while(sum<=temp_n) {
					if(sum==temp_n) {
						b=true;
					}
					temp_count++;
					
					if((sum+j*j)>temp_n) {
						while((sum+j*j)>temp_n) {
							j--;
							//System.out.println(j);
							if(j==0) {
								j=1;
								break;
							}
						}
					}
					
					sum=sum+j*j;
				}
				if(temp_count<count && b==true) {
					count=temp_count;
					//System.out.println(count);
				}
				sum=0;
				b=false;
			}
			
			return count;
		}
	}

}

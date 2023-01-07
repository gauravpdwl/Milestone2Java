package arrayRecursion;

import java.util.Scanner;

public class CheckNumberInArray {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		int x = s.nextInt();
		System.out.println(Solution.checkNumber(input, x));
	}
	
	public class Solution {
		
		public static boolean checkNumber(int input[], int x) {
			
			if(input.length==1) {
				if(input[0]==x) {
					return true;
				}
				else {
					return false;
				}
			}
			boolean b=false;
			int subarray[]=new int[input.length-1];
			for(int i=1;i<input.length;i++) {
				subarray[i-1]=input[i];
			}
			
			if(input[0]==x) {
				b=true;
			}
			else {
				b=checkNumber(subarray,x);
			}
			
			return b;
		}
	}
}

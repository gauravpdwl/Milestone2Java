package arrayRecursion;

import java.util.Scanner;

public class FirstIndexOccuranceOfNumberInArray{
	
	static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		System.out.println(Solution.firstIndex(input, x));
	}
	

	public class Solution {

	public static int firstIndex(int input[], int x) {
		
		if(input.length==0) {
			return -1;
		}
		
		if(input[0]==x) {
			return 0;
		}
		
		int subarr[]=new int[input.length-1];
		for(int i=1;i<input.length;i++) {
			subarr[i-1]=input[i];
		}
		
		int i=firstIndex(subarr,x);
		
		if(i==-1) {
			return -1;
		}else {
			return i+1;
		}
		
	}
	
}
}







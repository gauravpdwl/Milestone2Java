package arrayRecursion;

import java.util.Scanner;

public class QuickSort {
	
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
		Solution.quickSort(input);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
		
	}
	
	public class Solution {
		
		public static void quickSort(int[] input) {
			
			quick(input,0,input.length-1);
			
		}
		
		public static void quick(int []input, int si, int ei) {
			if(si>=ei) {
				return;
			}
			
			int pi=partition(input, si ,ei);
			quick(input, si,pi-1);
			quick(input, pi+1,ei);
		}
		
		public static int partition(int a[], int si, int ei) {
			
			int pivotele=a[si];
			
			int smallercount=0;
			for(int i=si;i<=ei;i++) {
				if(a[i]<pivotele) {
					smallercount++;
				}
			}
			
			int temp=a[si+smallercount];
			a[si+smallercount]=pivotele;
			a[si]=temp;
			
			int i=si;
			int j=ei;
			
			while(i<j) {
				if(a[i]<pivotele) {
					i++;
				}else if(a[j]>=pivotele){
					j--;
				}else {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					i++;
					j--;
				}
			}
			
			
			return si+smallercount;
		}
		
	}
}
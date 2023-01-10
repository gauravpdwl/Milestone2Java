package arrayRecursion;

import java.util.Scanner;

public class MergeSort {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		solution.mergeSort(input);
		printArray(input);
	}
	
	public class solution {

		public static void mergeSort(int[] input){
			// Write your code here
			if(input.length==1) {
				return;
			}
			
			int mid=input.length/2;
			int a[]=new int[mid];
			for(int i=0;i<mid;i++) {
				a[i]=input[i];
			}
			
			int b[]=new int[input.length-mid];
			for(int i=mid;i<input.length;i++) {
				b[i-mid]=input[i];
			}
			
			mergeSort(a);
			mergeSort(b);
			sort(input,a,b);
		}
		
		public static void sort(int input[],int a[], int b[]) {
			
			int i=0;
			int j=0;
			int k=0;
			
			while(i<a.length && j<b.length) {
				if(a[i]<b[j]) {
					input[k]=a[i];
					k++;
					i++;
				}else {
					input[k]=b[j];
					k++;
					j++;
				}
			}
			
			while(i<a.length) {
				input[k]=a[i];
					k++;
					i++;
			}
			
			while(j<b.length) {
				input[k]=b[j];
				k++;
				j++;
			}
			
		}
	}
}










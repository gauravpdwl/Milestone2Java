package StackDS;

import java.util.Stack;

public class StockSpan {
	public static void main(String args[]) {
		int price[]= {100,80,60,70,60,75,85};
		int list[]=findStockSpan(price);
		for(int i=0;i<list.length;i++) {
			System.out.println(" "+list[i]);
		}
		
	}
	
	public static int[] findStockSpan(int price[]) {
		
//		for(int i=0;i<price.length;i++) {
//			System.out.print(" "+price[i]);
//		}
		
		int output[]=new int[price.length];
		output[0]=1;
		for(int i=1;i<price.length;i++) {
			int count=1;
			int j=i-1;
			while(j>=0 && price[j]<price[i]) {
				count++;
				j--;
			}
			output[i]=count;
		}
		
		return output;
		
	}
}

package arrayRecursion;

import java.util.Arrays;
import java.util.Scanner;


public class SplitArray {

	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(solution.splitArray(input));
	}
	

public class solution {

	public static boolean splitArray(int input[]) {
		
		Arrays.sort(input);
		
		int a[]=new int[input.length];
		int b[]=new int[input.length];
		int j=0;
		int k=0;
		int suma=0;
		int sumb=0;
		
		for(int i=0;i<a.length;i++) {
			if(input[i]%5==0) {
				a[j]=input[i];
				suma=suma+a[j];
				j++;
			}else if(input[i]%3==0) {
				b[k]=input[i];
				sumb=sumb+b[k];
				k++;
			}else {
				if(suma==0) {
					a[j]=input[i];
					suma=suma+a[j];
					j++;
				}else if(sumb==0) {
					b[k]=input[i];
					sumb=sumb+b[k];
					k++;
				}else {
					if(suma+input[i]<=sumb) {
						a[j]=input[i];
						suma=suma+a[j];
						j++;
					}else {
						b[k]=input[i];
						sumb=sumb+b[k];
						k++;
					}
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		
		System.out.println(suma);
		System.out.println(sumb);
		
		if(suma == sumb) {
			return true;
		}else {
			return false;
		}
		
	}
	

}

}

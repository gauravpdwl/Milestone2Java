package Generics;

public class Print {
	public static<T> void display(T arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String args[]) {
		Integer a[]=new Integer[5];
		for(int i=0;i<a.length;i++) {
			a[i]=i+1;
		}
		
		display(a);
		
		char c;
		String a1[]=new String[5];
		for(int i=0;i<a.length;i++) {
			c=(char)('a'+i);
			a1[i]=""+c;
		}
		
		display(a1);
	}
}

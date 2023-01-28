package Generics;

import java.util.ArrayList;

public class ArrayListClass {
	public static void main(String args[]) {
		ArrayList<Integer> ar=new ArrayList<>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(5);
		
		System.out.println(ar.size());
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		ar.set(2, 1);
		System.out.println(ar.get(0)==ar.get(2));
		
		for(int i:ar) {
			//i holds element from ArrayList
			System.out.println(i);
		}
		
	}
}

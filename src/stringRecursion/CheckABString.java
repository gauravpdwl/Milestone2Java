package stringRecursion;

import java.util.Scanner;

public class CheckABString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println(Solution.checkAB(input));
	}
	
	public class Solution {

		public static boolean checkAB(String input) {
			// Write your code here
			if(input.length()==0){
				return true;
			}
			
			if(input.length()==1 && input.charAt(0)=='a') {
				return true;
			}
			
			if(input.charAt(0)!='a') {
				return false;
			}
			
			String s="";
			if(input.charAt(0)=='a') {
				if(input.length()>2 && input.charAt(1)=='b' && input.charAt(2)=='b') {
					s=input.substring(3);
				}else {
					s=input.substring(1);
					System.out.println("reached here - "+s);
				}
			}
			
			return checkAB(s);
		}
	}

}
package stringRecursion;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
    	String input = s.next();
    	System.out.println(Solution.removeConsecutiveDuplicates(input));
    	int a=Integer.MAX_VALUE;
    }
	
	public class Solution {

		public static String removeConsecutiveDuplicates(String s) {
			// Write your code here
			
			if(s.length()<=1) {
				return s;
			}
			
			if(s.charAt(0)==s.charAt(1)) {
				String output=removeConsecutiveDuplicates(s.substring(1));
				return output;
			}else {
				String output=removeConsecutiveDuplicates(s.substring(1));
				return s.charAt(0)+output;
			}
		}

	}
}

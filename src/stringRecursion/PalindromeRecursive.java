package stringRecursion;

import java.util.Scanner;

public class PalindromeRecursive {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		//System.out.println(input.length());
		System.out.println(solution.isStringPalindrome(input));
		
	}
	
	public class solution {

		public static boolean isStringPalindrome(String input) {
			// Write your code here
			if(input.length()==0) {
				return true;
			}
			
			if(input.length()==1) {
				return true;
			}
			
			if(input.charAt(0)!=input.charAt(input.length()-1)) {
				return false;
			}
			
			boolean b=isStringPalindrome(input.substring(1, input.length()-1));
			return b;
		}
	}

}

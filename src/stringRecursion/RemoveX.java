package stringRecursion;

import java.util.Scanner;

public class RemoveX {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution.removeX(input));
	}
	
	public class solution {

		// Return the changed string
		public static String removeX(String input){
			
			if(input.length()==0) {
				return input;
			}
			
			String substr=removeX(input.substring(1));
			
			char c=input.charAt(0);
			
			if(c=='x') {
				return ""+substr;
			}else {
				return c+substr;
			}
		}
	}

}
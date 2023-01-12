package stringRecursion;

public class ExtraPrograms {
	/********************SOME EXTRA CODES***********************/
	public class solution {
		//ADD STAR BETWEEN PAIR
		// Return the updated string
		public static String addStars(String s) {
			// Write your code here
			if(s.length()<=1){
				return s;
			}

			if(s.charAt(0)==s.charAt(1)){
				return s.charAt(0)+"*"+addStars(s.substring(1));
			}else{
				return s.charAt(0)+addStars(s.substring(1));
			}
		}
		
		//CONVERT STRING TO INTEGER
		public static int convertStringToInt(String input){
			// Write your code here
			if(input.length()==0){
				return 0;
			}

			int a = input.charAt(0) - 48;
			double no=a*Math.pow(10, input.length()-1);
			return (int)no+convertStringToInt(input.substring(1));
		}
		
		//COUNT NO OF ZEROES AND NOT PREFIX ONES
		public static int countZerosRec(int input){
			// Write your code here
			if(input==0){
				return 1;
			}
			
			if(input/10==0){
				return 0;
			}
			int no=input%10;
			if(no==0){
				return 1+countZerosRec(input/10);
			}else{
				return countZerosRec(input/10);
			}
		}
	}
	
}

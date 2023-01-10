package stringRecursion;

public class ReplacePi {
	
	public static void main(String args[]) {
		System.out.println(replace("gauravpipadwal"));
	}
	
	public static String replace(String s) {
		
		if(s.length()<=1) {
			return s;
		}
		
		if(s.charAt(0)=='p' && s.charAt(1)=='i') {
			String smalloutput=replace(s.substring(2));
			return "3.14"+smalloutput;
		}else {
			String smalloutput=replace(s.substring(1));
			return s.charAt(0)+smalloutput;
		}
		
	}
}

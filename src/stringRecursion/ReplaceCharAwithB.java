package stringRecursion;

public class ReplaceCharAwithB {
	public static void main(String args[]) {
		
		String s="eebeebeebe";
		System.out.println(replace(s,'e','f'));
	}
	
	public static String replace(String s, char a, char b) {
		
		if(s.length()==0) {
			return s;
		}
		
		String substr=replace(s.substring(1),a,b);
		char c=s.charAt(0);
		if(c==a) {
			return b+substr;
		}else {
			return c+substr;
		}
		
	}
}

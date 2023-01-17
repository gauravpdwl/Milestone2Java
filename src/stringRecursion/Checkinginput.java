package stringRecursion;

public class Checkinginput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ab";
		System.out.println(isPalindrome(s));
		System.out.println(s.substring(0,s.length()-1));
	}
	
	public static boolean isPalindrome(String s){
        if(s.length()==1){
            return true;
        }
        
        if(s.length()>=2 && s.charAt(0)==s.charAt(s.length()-1)){
            return isPalindrome(s.substring(1,s.length()-1));
        }
        else{
            return false;
        }

    }
	
	public String longestPalindrome(String s) {
        int longest_string=0;
        String ls="";
        String lonstr="";

        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                ls=ls+s.charAt(j);
                boolean b=isPalindrome(ls);
                if(b){
                    if(ls.length()>longest_string){
                        longest_string=ls.length();
                        lonstr=ls;
                    }
                }
            }
            ls="";
        }

        return lonstr;
    }
}

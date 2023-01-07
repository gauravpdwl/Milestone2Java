package arrayRecursion;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution.lengthOfLongestSubstring("aaaba"));
	}
	
	class Solution {
	    public static int lengthOfLongestSubstring(String s) {
	      final int n = s.length();
	    int len = 0;
	    int [] repeat = new int[128];
	    for (int c = 0, j = 0, i = 0; j < n; j++) {
	        c = s.charAt(j);
	        
	        System.out.println("c - "+c);
	        
	        i = Math.max(repeat[c], i);
	        
	        System.out.println("i - "+i);
	        System.out.println("j - "+j);
	        
	        len = Math.max(len, j - i +1);
	        
	        System.out.println("length - "+len);
	        System.out.println("reapat[c] - "+repeat[c]);
	        
	        repeat[c] = j+1;
	        
	        System.out.println("reapat[c] - "+repeat[c]);
	    }
	    return len;
	    }
	}

}

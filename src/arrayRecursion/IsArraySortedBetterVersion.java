package arrayRecursion;

public class IsArraySortedBetterVersion {
	public static void main(String args[]) {
		int a[]= {1,2,3};
		System.out.println(isSorted(a,0));
	}
	
	public static boolean isSorted(int input[], int si) {
		
		if(si==input.length-1) {
			return true;
		}
		
		if(input[si]>input[si+1]) {
			return false;
		}
		
		boolean b=isSorted(input,si+1);
		return b;
	}
}

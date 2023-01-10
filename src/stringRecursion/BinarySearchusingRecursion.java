package stringRecursion;

public class BinarySearchusingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1, 2, 3, 5, 6};
		System.out.println(binarySearch(a,0,a.length-1,7));
	}
	
	public static int binarySearch(int a[], int si, int end, int x) {
		if(si>end) {
			return -1;
		}
		
		int mid=(si+end)/2;
		if(a[mid]==x) {
			return mid;
		}else if(x>a[mid]) {
			return binarySearch(a, mid+1, end, x);
		}else {
			return binarySearch(a, si, mid-1, x);
		}
	}

}

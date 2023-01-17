package arrayRecursion;

public class TwoDArray {
	
	public static void main(String args[]) {
		int arr[][]= {
				{1,2},
				{4,5,6},
				{7,8,9,10}
		};
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}

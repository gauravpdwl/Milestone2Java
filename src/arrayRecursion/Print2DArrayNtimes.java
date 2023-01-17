package arrayRecursion;

import java.util.Scanner;

public class Print2DArrayNtimes {

	static Scanner s = new Scanner(System.in);
	
	public static int[][] takeInput(){
		int numRows = s.nextInt();
		int numCols = s.nextInt();
		int[][] input = new int[numRows][numCols];
		for(int i = 0; i < numRows; i++){
			for(int j = 0; j < numCols; j++){
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}

	public static void main(String[] args) {
		int[][] input = takeInput();
		solution.print2DArray(input);
	}
	
	public class solution {
		public static void print2DArray(int input[][]) {
			// Write your code here
			int n=input.length;
			for(int i=0;i<input.length;i++) {
				int temp_n=n;
				while(temp_n>0) {
					for(int j=0;j<input[i].length;j++) {
						System.out.print(input[i][j]);
					}
					temp_n--;
					System.out.println();
				}
				n--;
			}

		}
	}
}
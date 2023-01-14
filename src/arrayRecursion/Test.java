package arrayRecursion;

public class Test {
//**************************************************************	
//related to Quick sort very imp to understand logic of swapping
//**************************************************************
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {8,6,9,7,5,2,3,4,1,0};
		int pivotele=a[4];
		int i=1;
		int temp=0;
		int j=8;
		while(i<j) {
			if(a[i]<pivotele) {
				i++;
			}else if(a[j]>=pivotele){
				j--;
			}else {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
			System.out.println("i - "+i);
			System.out.println("j - "+j);
			System.out.println("temp - "+temp);
			System.out.println("-------");
		}
		
		for(int k=0;k<a.length;k++) {
			System.out.println(a[k]+" ");
		}
	}

}

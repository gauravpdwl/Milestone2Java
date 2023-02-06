package DynamicArray;

public class DynamicArray {
	
	private int arr[];
	private int counter;
	
	public DynamicArray() {
		arr=new int[5];
		counter=0;
	}
	
	public void add(int no) {
		if(counter>arr.length-1) {
			increaseArraySize();
		}
		arr[counter]=no;
		counter++;
	}
	
	private void increaseArraySize() {
		System.out.println(arr.length);
		int temp[]=arr;
		arr=new int[temp.length*2];
		for(int i=0;i<temp.length;i++) {
			arr[i]=temp[i];
		}
	}
	
	public void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
}

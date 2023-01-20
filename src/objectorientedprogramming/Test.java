package objectorientedprogramming;

class Test{
    public static void main(String[] args) 
    { 
        Solution s=new Solution();
        s.name="Padwal";
        s.print();
        
    }
    
}


class Solution{
	String name="Gaurav";
	
	public void print() {
		System.out.println("Your entered name is - "+name);
	}
}



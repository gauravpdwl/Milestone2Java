package objectorientedprogramming;

class Test{
    public static void main(String[] args) 
    { 
        T object = new T(); 
    } 
}

class T{
	int a; 
    int b; 
    T() 
    {   
        this(10, 20);   
        System.out.print("constructor one "); 
    } 
    T(int a, int b) 
    { 
        this.a = a; 
        this.b = b; 
        System.out.print("constructor two "); 
    } 
}
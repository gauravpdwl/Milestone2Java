package ExceptionHandling;

public class Calci{
	public static int calculate(int d)  throws Exception{
		int n=10;
		int result=0;
		if(d==0) {
			throw new DivideByZeroException();
		}else if(d==1){
			throw new ArithmaticException();
		}else if(d==2){
			throw new Exception();
		}else {
			result=n/d;
		}
		
		return result;
	}
}

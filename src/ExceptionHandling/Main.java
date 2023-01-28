package ExceptionHandling;

public class Main {
	public static void main(String args[]) {
		Calci c=new Calci();
		int result = 0;
		try {
			result = c.calculate(2);
		} 
		catch(DivideByZeroException e) {
			System.out.println("DivideByZeroException");
		}
		catch(ArithmaticException e) {
			System.out.println("Arithmatic Exception");
		}
		catch(Exception e) {
			System.out.println("Exception block");
		}
		
		System.out.println("Result - "+result);
	}
}

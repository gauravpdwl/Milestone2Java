package objectorientedprogramming;

public class Fraction {
	int Numerator;
	int Denominator;
	
	public Fraction(int Numerator, int Denominator) {
		this.Numerator=Numerator;
		this.Denominator=Denominator;
		simplify(this.Numerator,this.Denominator);
	}

	private void simplify(int Numerator, int Denominator) {
		// TODO Auto-generated method stub
		int min=Math.min(Numerator, Denominator);
		int common=1;
		for(int i=2;i<=min;i++) {
			if(Numerator%i==0 && Denominator%i==0) {
				common=i;
			}
		}
		this.Numerator=this.Numerator/common;
		this.Denominator=this.Denominator/common;
		display();
	}
	public void display() {
		System.out.println(Numerator+"/"+Denominator);
	}
	public void add(Fraction f) {
		this.Numerator=this.Numerator*f.Denominator+f.Numerator*this.Denominator;
		this.Denominator=this.Denominator*f.Denominator;
		simplify(Numerator,Denominator);
	}
	
	
}

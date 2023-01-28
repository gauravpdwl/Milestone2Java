package Generics;

public class Pair<S, T> {
	
	S a;
	T b;
	
//	public Pair(S a, T b) {
//		
//		this.a=a;
//		this.b=b;
//	}
	
	public S geta() {
		return a;
	}
	
	public void seta(S a) {
		this.a=a;
	}
	
	public T getb() {
		return b;
	}
	
	public void setb(T b) {
		this.b=b;
	}
}

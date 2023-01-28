package Generics;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pair<Pair<String, Integer>,String> p=new Pair<Pair<String, Integer>,String>();
		Pair<String, Integer> ip=new Pair<String, Integer>();
		
		ip.seta("HELLO");
		ip.setb(0);
		
		p.seta(ip);
		p.setb("Gaurav");
		
		System.out.println("a of ip-"+p.geta().geta());
		System.out.println("b of ip-"+p.geta().getb());
		System.out.println(p.getb());
	}

}

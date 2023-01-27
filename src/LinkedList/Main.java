package LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	//Dynamic Array
		DynamicArray d=new DynamicArray();
		for(int i=0;i<20;i++) {
			d.add(i+1);
		}
		d.display();
		//Dynamic Array		*/
		
		Vehicle c=new Car();
		c.displaySpeed();
		c.carName();
		c.maxSpeed=100;//only Vehicle class variables are available
		//c.name="Jaguar";//Car class variables are not available
	}

}

package AbstractionInterface;

public class MainInterface {
	public static void main(String args[]) {
		CarI c=new CarI();
		c.carName();
		c.displayCompanyName();
		c.displaySpeed();
		c.displayTyreCount();
		System.out.println("Is C is Car - "+c.isCar());
	}
}

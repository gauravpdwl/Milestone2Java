package AbstractionInterface;

public class Car extends Vehicle {
	String name;
	
	public Car() {
		name="Range Rover";
	}
	
	public void displayCarName() {
		System.out.println(name);
	}
	
	@Override
	public void displaySpeed() {
		// TODO Auto-generated method stub
		System.out.println(super.maxSpeed);
	}
	
}

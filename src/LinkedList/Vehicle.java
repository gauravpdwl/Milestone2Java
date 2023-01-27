package LinkedList;

public class Vehicle {
	
	public int maxSpeed;
	
	public Vehicle() {
		maxSpeed=01;
		System.out.println("Vehicle Default Constructor");
	}
	
	public Vehicle(int maxSpeed) {
		this.maxSpeed=maxSpeed;
	}
	
	public void displaySpeed() {
		System.out.println("Max speed of vehicle is "+maxSpeed);
	}
	
	public void carName() {
		System.out.println("Vehicle");
	}
}

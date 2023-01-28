package AbstractionInterface;

public abstract class Vehicle {
	int maxSpeed;
	
	public Vehicle() {
		maxSpeed=100;
	}
	
	public abstract void displaySpeed();
	
	public void setMaxSpeed(int speed) {
		maxSpeed=speed;
	}
}

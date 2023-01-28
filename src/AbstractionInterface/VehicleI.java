package AbstractionInterface;

public abstract class VehicleI {
	int maxspeed;
	
	public VehicleI() {
		maxspeed=100;
	}
	
	public void displaySpeed() {
		System.out.println("MaxSpeed - "+maxspeed);
	}
	
	public abstract void carName();
}

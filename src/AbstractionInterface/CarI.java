package AbstractionInterface;

public class CarI extends VehicleI implements VehicleInterface{
	String name;
	String company;
	
	public CarI() {
		name="GT";
		company="BMW";
	}
	
	@Override
	public void carName() {
		// TODO Auto-generated method stub
		System.out.println("Car Name is : "+name);
	}

	@Override
	public void displayCompanyName() {
		// TODO Auto-generated method stub
		System.out.println("Company Name is : "+company);
	}

	@Override
	public boolean isCar() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public void displayTyreCount() {
		System.out.println("Tyres - "+VehicleInterface.tyreCount);
	}
	
}

package DynamicArray;

public class Car extends Vehicle {
	String name;
	
	public Car() {
		this("Range Rover");
		//name="BMW"; // If you are calling parameter constructor then do not assign default name.
		System.out.println("Car Default Constructor");
	}
	
	public Car(String name) {
		System.out.println("Constructor called by default constructor");
		this.name=name;
	}
	public void carName() {
		super.carName();
		System.out.println("Name of Car - "+name);
	}
}

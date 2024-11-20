package interfaceDemo;

interface ElectricVehicle {
	// Abstract method that must be implemented
	void charge();

	// Default method with implementation
	default void startEngine() {
		System.out.println("Starting electric engine...");
	}
}

interface GasVehicle {
	// Abstract method that must be implemented
	void refuel();

	// Default method with implementation
	default void startEngine() {
		System.out.println("Starting gas engine...");
	}
}

class ElectricCar implements ElectricVehicle, GasVehicle {
	@Override
	public void charge() {
		System.out.println("Charging electric car...");
	}

	@Override
	public void refuel() {
		System.out.println("Refueling gas car...");
	}

	// Which startEngine() method will be called?
	@Override
	public void startEngine() {
		System.out.println("Starting electric car engine...");
	}
}

public class VehicleTest {
	public static void main(String[] args) {
		ElectricCar car = new ElectricCar();
		car.startEngine(); // Which startEngine() method will be executed?
		car.charge(); // Charging method
		car.refuel(); // Refueling method
	}
}

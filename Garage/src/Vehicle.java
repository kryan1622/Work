
public abstract class Vehicle {
	private int wheels;
	private String fuelType;
	private double engineCapacity;
	private String registrationNumber;

	public Vehicle(int wheels, String fuelType, double engineCapacity, String registrationNumber) {
		this.wheels = wheels;
		this.fuelType = fuelType;
		this.engineCapacity = engineCapacity;
		this.registrationNumber = registrationNumber;
	}

	public String toString() {
		return wheels + fuelType + engineCapacity + registrationNumber;
	}

	public int getWheels() {
		return wheels;
	}

	public String getFuelType() {
		return fuelType;
	}

	public double getengineCapacity() {
		return engineCapacity;
	}

	public String getregistrationNumber() {
		return registrationNumber;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

}

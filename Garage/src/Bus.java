
public class Bus extends Vehicle {
	private int busNumber;
	private String busCompany;
	private int numberOfSeats;

	public Bus(int wheels, String fuelType, double engineCapacity, String registrationNumber, int busNumber,
			String busCompany, int numberOfSeats) {
		super(wheels, fuelType, engineCapacity, registrationNumber);
		this.busNumber = busNumber;
		this.busCompany = busCompany;
		this.numberOfSeats = numberOfSeats;
	}

	public String toString() {
		return super.toString() + busNumber + busCompany + numberOfSeats + this.getClass().getSimpleName();
	}

	public int getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}

	public String getBusCompany() {
		return busCompany;
	}

	public void setBusCompany(String busCompany) {
		this.busCompany = busCompany;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfString) {
		this.numberOfSeats = numberOfString;
	}

}


public class Boats extends Vehicle {
	private int numberOfLifeJackets;
	private double sizeOfBoat;
	private double maxSpeed;

	public Boats(int wheels, String fuelType, double engineCapacity, String registrationNumber, int numberOfLifeJackets,
			double sizeOfBoat, double maxSpeed) {
		super(wheels, fuelType, engineCapacity, registrationNumber);
		this.numberOfLifeJackets = numberOfLifeJackets;
		this.sizeOfBoat = sizeOfBoat;
		this.maxSpeed = maxSpeed;
	}

	public String toString() {
		return super.toString() + numberOfLifeJackets + sizeOfBoat + maxSpeed + this.getClass().getSimpleName();

	}

	public int getNumberOfLifeJackets() {
		return numberOfLifeJackets;
	}

	public void setNumberOfLifeJackets(int numberOfLifeJackets) {
		this.numberOfLifeJackets = numberOfLifeJackets;
	}

	public double getSizeOfBoat() {
		return sizeOfBoat;
	}

	public void setSizeOfBoat(double sizeOfBoat) {
		this.sizeOfBoat = sizeOfBoat;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

}

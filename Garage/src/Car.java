
public class Car extends Vehicle {
	private int numberOfDoors;
	private int bootSize;
	private boolean rightHandDrive;
	private String colour;

	public Car(int wheels, String fuelType, double engineCapacity, String registrationNumber, int numberOfDoors,
			int bootSize, boolean rightHandDrive, String colour) {
		super(wheels, fuelType, engineCapacity, registrationNumber);
		this.numberOfDoors = numberOfDoors;
		this.bootSize = bootSize;
		this.rightHandDrive = rightHandDrive;
		this.colour = colour;

	}

	public String toString() {
		return super.toString() + numberOfDoors + bootSize + rightHandDrive + colour + this.getClass().getSimpleName();
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public int getBootSize() {
		return bootSize;
	}

	public void setBootSize(int bootSize) {
		this.bootSize = bootSize;
	}

	public boolean isRightHandDrive() {
		return rightHandDrive;
	}

	public void setRightHandDrive(boolean rightHandDrive) {
		this.rightHandDrive = rightHandDrive;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}

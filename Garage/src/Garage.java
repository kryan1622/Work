import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();

	public ArrayList<Vehicle> getVehicleList() {
		return vehicleList;
	}

	public void setVehicleList(ArrayList<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}

	public void calculateBill() {
		for (Vehicle i : vehicleList) {
			switch (i.getClass().getCanonicalName()) {
			case "Car":
				System.out.println("Your Car Bill is" + " " + "£" + i.getengineCapacity() * 100);
				break;
			case "Boats":
				System.out.println("Your Boat Bill is" + " " + "£" + i.getengineCapacity() * 150);
				break;
			case "Bus":
				System.out.println("Your Bus Bill is" + " " + "£" + i.getengineCapacity() * 250);
				break;
			}
		}

	}

	void calculateBill2() {
		for (Vehicle v : vehicleList) {
			if (v instanceof Car) {
				System.out.println("Your Car Bill is" + " £" + ((Car) v).getNumberOfDoors() * 100);
			}
			if (v instanceof Bus) {
				System.out.println("Your Bus Bill is" + " £" + ((Bus) v).getBusNumber() * 150);
			}
			if (v instanceof Boats) {
				System.out.println("Your Boat Bill is" + " £" + ((Boats) v).getSizeOfBoat() * 250);
			}
		}

	}

	public void removeCars() {
		int index = 0;
		ArrayList<Integer> m1 = new ArrayList<Integer>();

		for (Vehicle v : getVehicleList()) {
			if (v.getClass().getCanonicalName() == "Car") {
				m1.add(index);
			}
			index++;
		}
		for (int i : m1) {
			vehicleList.remove(vehicleList.get(i));
		}

	}

	public void removeRegNumber(String input) {
		int count = 0;
		ArrayList<Integer> m2 = new ArrayList<Integer>();
		for (Vehicle v : getVehicleList()) {
			if (v.getregistrationNumber().equals(input)) {
				m2.add(count);
			}
			count++;
		}
		for (int i : m2) {
			vehicleList.remove(vehicleList.get(i));
		}
	}
}

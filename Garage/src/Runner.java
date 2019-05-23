
public class Runner {
	public static void main(String[] args) {
		Car Honda = new Car(4, "petrol", 1.4, "Y705YPU", 4, 23, true, "red");
		Bus stageCoach1 = new Bus(4, "diesel", 1.9, "RZ16DGY", 10, "Stagecoach", 86);
		Boats yacht = new Boats(0, "petrol", 3.2, "Mr. yachtstar", 26, 25.3, 120.0);
		System.out.println(Honda);
		System.out.println(stageCoach1);
		System.out.println(yacht);
		Garage g = new Garage();
		g.getVehicleList().add(Honda);
		g.getVehicleList().add(stageCoach1);
		g.getVehicleList().add(yacht);
		g.calculateBill();
		g.calculateBill2();
		g.removeCars();
		g.calculateBill();
		g.removeRegNumber("RZ16DGY");
		g.calculateBill();

	}

}


public class Dolphin extends Mammal {
	private int sizeOfFins;
	private int lengthOfFins;
	private String favouriteFood;

	public String toString() {
		return sizeOfFins + lengthOfFins + favouriteFood;

	}

	public int areaOfDolphin(int sizeOfFins, int lengthOfFins) {
		return (sizeOfFins * lengthOfFins);

	}
}
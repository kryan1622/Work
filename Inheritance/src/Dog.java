
public class Dog extends Mammal {
	private String favouriteFood;
	private String breed;
	public String name;

	public String toString() {
		return breed + name + favouriteFood;
	}

	public String showName(String name) {
		return ("My name is" + name);
	}

}

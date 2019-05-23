
public class Animal {

	private String weight;
	private String colour;
	private String legs;
	private String breathe;

	public String toString() {
		return weight + colour + legs;
	}

	public void doesItBreathe(String breathe) {
		this.breathe = breathe;
	}

}

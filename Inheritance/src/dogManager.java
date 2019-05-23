import java.util.ArrayList;

public class dogManager {
	private ArrayList<Dog> dogList = new ArrayList<Dog>();

	public Dog searchForName(String name) {
		return dogList.stream().filter(s -> s.name.equals(name)).findFirst().get();
	}
}

import java.util.ArrayList;

public class PersonManager {
	private ArrayList<Person> personlist = new ArrayList<Person>();

	public Person searchForPerson(String Name) {
		return personlist.stream().filter(s -> s.Name.equals(Name)).findFirst().get();

	}

	public ArrayList<Person> getpersonlist() {
		return personlist;
	}

}

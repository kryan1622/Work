public class Person {

	public String Name;
	public int Age;
	public String Jobtitle;

	public Person(String Name, int Age, String Jobtitle) {
		this.Name = Name;
		this.Age = Age;
		this.Jobtitle = Jobtitle;
	}

	public String toString() {
		return Name + Age + Jobtitle;
	}

	public String getName() {

		return Name;

	}

	public int getAge() {
		return Age;
	}

	public String getJobtitle() {
		return Jobtitle;

	}
}

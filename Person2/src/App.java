public class App {

	public static void main(String[] args) {
		Person myPerson = new Person("Bob", 22, "Builder");
		Person myPerson2 = new Person("Dave", 31, "Dentist");
		System.out.println(myPerson);
		System.out.println(myPerson2);
		PersonManager pm1 = new PersonManager();
		pm1.getpersonlist().add(myPerson);
		pm1.getpersonlist().add(myPerson2);
		System.out.println(pm1.getpersonlist());
		System.out.println(pm1.searchForPerson("Bob"));
		System.out.println(myPerson.getName());
		System.out.println(myPerson2.getAge());
		System.out.println(myPerson.getJobtitle());

	}

}

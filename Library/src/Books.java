
public class Books extends Library implements Checkable {

	private String Name;

	public Books(String inStock, String Name) {
		super.getinStock();
		this.Name = Name;
	}

	public String checkinStock(String input) {
		return Name + " " + super.getinStock();

	}

}

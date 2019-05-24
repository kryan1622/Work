
public class number2words {

	private static String[] units = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
			"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen" };
	private static String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
			"Ninety" };

	public static String convert(int i) {
		if (i < 20)
			return units[i];
		if (i < 100)
			return tens[i / 10] + ((i % 10 > 0) ? "" + convert(i % 10) : "");
		return convert(i);
	}
}

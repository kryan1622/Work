
public class Calculator {

	public static void main(String[] args) {

		System.out.println(add2Numbers(10, 1));
		System.out.println(subtract2Numbers(24, 8));
		System.out.println(multiple2Numbers(5, 2));
		System.out.println(divide2Numbers(8, 2));

		int testing = add2Numbers(0, 1);
		{
			if (testing > 10) {

				System.out.println("Your number is greater than 10");
			} else {
				System.out.println("Your number is less than 10");
			}
		}
		int testing1 = subtract2Numbers(5, 1);
		int testing2 = add2Numbers(10, 4);
		if (testing2 > 4 && testing1 < 10) {
			System.out.println("The");
		} else {
			System.out.println("he");
		}
	}

	private static int add2Numbers(int number1, int number2) {
		int result = number1 + number2;
		return result;
	}

	private static int subtract2Numbers(int number1, int number2) {
		int result = number1 - number2;
		return result;
	}

	private static int multiple2Numbers(int number1, int number2) {
		int result = number1 * number2;
		return result;
	}

	private static int divide2Numbers(int number1, int number2) {
		int result = number1 / number2;
		return result;
	}
}

public class Iteration {
	public static void main(String[] args) {
		// interation1();
		// interation2();
		// interation3();
		// interation4();
		// System.out.println(question1(400));
		// System.out.println(question2(40, 20));
		question7(23);
	}

	static int question1(int parameter) {
		parameter = parameter + 1;
		return parameter;
	}

	static int question2(int number1, int number2) {
		return number1 + number2;
	}

	public static void question7(int Input) {

		// int counter

		for (int i = 1; i <= Input; i++) {
			if (i % 5 == 0) {
				System.out.println("div by 5");
				// counter++
			}

		}
		// return
	}

	static void interation1() {
		for (int i = 0; i < 90; i++) {
			System.out.println(i);
		}

	}

	static void interation2() {
		for (int j = 100; j < 999; j++) {
			System.out.println(j);
		}
	}

	static void interation3() {
		for (int k = 100; k < 999; k++) {
			if (k == 200)
				continue;
			if (k == 450)
				continue;
			System.out.println(k);
		}
	}

	static void interation4() {
		for (int i = 1; i < 10; i++) {
			switch (i) {
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Six");
				break;
			case 7:
				System.out.println("Seven");
				break;
			case 8:
				System.out.println("Eight");
				break;
			case 9:
				System.out.println("Nine");
				break;
			case 10:
				System.out.println("Ten");
				break;
			}

		}
	}
}

package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class collections {
	public static void main(String[] args) {

		/*
		 * question1(); question2();
		 */
		q1();
		q2i();
		q3();
		System.out.println(q5());
		q6();
		System.out.println(countWord());
		System.out.println(countNumbers());
		System.out.println(highestNumber());
		System.out.println(oddNumbers());

	}

	public static void question1() {
		int[] arrayOfInts = new int[10];

		for (int i = 0; i < arrayOfInts.length; i++) {
			arrayOfInts[i] = i;
			System.out.println("Number=" + i);

		}
	}

	public static void question2() {
		ArrayList<Integer> q2 = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			q2.add(i);
			System.out.println("Number=" + i);

		}

	}

	public static void q1() {
		ArrayList<Integer> method1 = new ArrayList<Integer>();
		for (int i = 0; i < 11; i++) {
			method1.add(i);
			System.out.println("Number=" + i);
		}
	}

	public static void q2i() {
		ArrayList<Integer> method2 = new ArrayList<Integer>();
		method2.add(9);
		method2.add(7);
		method2.add(5);
		System.out.println(method2.contains(5));

	}

	public static void q3() {
		ArrayList<String> method3 = new ArrayList<String>();
		method3.add("Hello");
		method3.add("World");
		method3.add("!");
		System.out.println(method3.contains("Big"));

	}

	/*
	 * public static void q4() { ArrayList<Integer> method4 = new
	 * ArrayList<Integer>(); ArrayList<Integer> method5 = new ArrayList<Integer>();
	 * method4.add(5); method4.add(8); method4.add(10); for (int i = 0; i < 3; i++)
	 * { if (method4.get(i) % 5 == 0) { method5.add(method4.get(i) * 10);
	 * System.out.println(method5.get(i)); } else { method5.add(method5.get(i));
	 * System.out.println(method5.get(i)); } }
	 * 
	 * }
	 */

	public static int q5() {
		ArrayList<String> List = new ArrayList<String>();
		List.add("Hello");
		List.add("World");
		List.add("Hello");
		int count = 0;
		for (String i : List) {
			if (i == "Hello") {
				count++;
			}
		}
		return count;

	}

	public static int countWord() {
		ArrayList<String> List = new ArrayList<String>();
		List.add("Hello");
		List.add("World");
		List.add("Hello");
		return (int) List.stream().filter(i -> i.equals("Hello")).count();
	}

	public static int countNumbers() {
		ArrayList<Integer> List = new ArrayList<Integer>();
		List.add(6);
		List.add(10);
		List.add(18);
		return (int) List.stream().reduce(0, Integer::sum);
	}

	public static void q6() {
		ArrayList<Integer> List = new ArrayList<Integer>();
		List.add(6);
		List.add(10);
		List.add(18);
		int count = 0;
		for (int i : List) {
			count += i;
		}
		System.out.println(count);

	}

	public static int highestNumber() {
		ArrayList<Integer> List = new ArrayList<Integer>();
		List.add(6);
		List.add(10);
		List.add(18);
		return (int) List.stream().max(Integer::compare).orElse(0);
	}

	public static List<Integer> oddNumbers() {

		ArrayList<Integer> q1 = new ArrayList<Integer>();
		q1.add(6);
		q1.add(10);
		q1.add(18);
		return q1.stream().filter(i -> i % 2 == 1).collect(Collectors.toList());
	}
}

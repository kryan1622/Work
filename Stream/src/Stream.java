import java.util.ArrayList;

public class Stream {
	public static void main(String[] args) {
		ArrayList<Integer> streamList = new ArrayList<Integer>();
		streamList.add(6);
		streamList.add(10);
		streamList.add(14);
		System.out.println(sumNumbers(streamList));

	}

	public static int sumNumbers(ArrayList<Integer> streamList) {
		return streamList.stream().reduce(0, Integer::sum);

	}

}

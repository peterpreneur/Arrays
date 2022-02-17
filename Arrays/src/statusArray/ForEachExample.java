package statusArray;

import java.util.stream.IntStream;

public class ForEachExample {
	public static void main(String[] args) {
		// Simple for-loop

		for (int i = 5; i > 0; i--) {
			doSomething(i);
		}
		System.out.println(" ");

		IntStream.of(1);

		// IntStream forEach
		IntStream.rangeClosed(0, 4).forEach(ForEachExample::doSomething);

	}

	private static void doSomething(int i) {
		System.out.println(i);
	}
}
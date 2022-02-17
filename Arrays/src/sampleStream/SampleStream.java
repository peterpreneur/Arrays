package sampleStream;

import java.util.*;
import java.util.stream.*;

public class SampleStream {

	public static void main(String[] args) {

		// Creating a String array
		String[] arr = { "Peter", "Ardian", "Setiawan" };

		// Using Arrays.stream() to convert
		// array into Stream
		Stream<String> stream = Arrays.stream(arr);
		stream.forEach(str -> System.out.print(str + " "));

		System.out.print("\n");

		// ----------------------------------------------------------------------
		int[] arr1 = { 3, 2, 1, 3 };
		IntStream stream1 = Arrays.stream(arr1);
		stream1.forEach(str -> System.out.println(str + " "));

		System.out.print("\n");

		// ----------------------------------------------------------------------
		IntStream stream2 = Arrays.stream(arr1);
		DoubleStream dblStream = stream2.asDoubleStream();
		dblStream.forEach(str -> System.out.println(str + " "));

		System.out.print("\n");

		// ----------------------------------------------------------------------
		IntStream stream3 = Arrays.stream(arr1);
		LongStream longStream = stream3.asLongStream().distinct().sorted();
		longStream.forEach(str -> System.out.println(str + " "));

		System.out.print("\n");

		// ----------------------------------------------------------------------
		IntStream stream4 = Arrays.stream(arr1);
		LongStream longStream1 = stream4.asLongStream().filter(i -> i > 1);
		longStream1.forEach(str -> System.out.println(str + " "));

		System.out.print("\n");

		// ----------------------------------------------------------------------
		Arrays.stream(arr1).filter(x -> x == 1).forEach(str -> System.out.println(str + " "));

		System.out.print("\n");

		// ----------------------------------------------------------------------
		Arrays.stream(arr1).forEachOrdered(str -> System.out.println(str + " "));

		System.out.print("\n");

		// ----------------------------------------------------------------------
		List<String> names = List.of("Adam", "Aaron", "Elon", "Edward", "David", "Jane");
		names.stream().filter((name) -> name.startsWith("A")).forEach(System.out::print);
		System.out.print("\n");

		//1. Using the assignment operator(=)
		List<String> temp1 = new ArrayList<>();
		temp1 = names;
		temp1.stream().filter((temp) -> temp.startsWith("A")).forEach(System.out::print);
		System.out.print("\n");

		//2. Passing in the constructor
		List<String> temp2 = new ArrayList<>(names);
		temp2.stream().filter((temp) -> temp.startsWith("A")).forEach(System.out::print);
		System.out.print("\n");
		
		//3. Adding one by one using add() method
		List<String> temp3 = new ArrayList<>();
		for (String temp : names) {
			temp3.add(temp);
		}
		temp3.stream().filter((temp) -> temp.startsWith("A")).forEach(System.out::print);
		System.out.print("\n");

	}
}
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

		// Displaying elements in Stream
		stream.forEach(str -> System.out.print(str + " "));
		System.out.print("\n");
		
		// Creating a int array
		int[] arr1 = { 3, 2, 1, 3 };

		IntStream stream1 = Arrays.stream(arr1);
		stream1.forEach(str -> System.out.println(str + " "));
		System.out.print("\n");

		IntStream stream2 = Arrays.stream(arr1);		
		DoubleStream dblStream = stream2.asDoubleStream();
		dblStream.forEach(str -> System.out.println(str + " "));
		System.out.print("\n");

		
		IntStream stream3 = Arrays.stream(arr1);		
		LongStream longStream = stream3.asLongStream().distinct().sorted();
		longStream.forEach(str -> System.out.println(str + " "));
		System.out.print("\n");

		IntStream stream4 = Arrays.stream(arr1);		
		LongStream longStream1 = stream4.asLongStream().filter(i -> i > 1);
		longStream1.forEach(str -> System.out.println(str + " "));
		System.out.print("\n");
		
		Arrays.stream(arr1).filter(x -> x == 1).forEach(str -> System.out.println(str + " "));
		System.out.print("\n");

		Arrays.stream(arr1).forEachOrdered(str -> System.out.println(str + " "));
		System.out.print("\n");

		
	}
}
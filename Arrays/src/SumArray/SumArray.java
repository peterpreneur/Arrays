package SumArray;

import java.util.Arrays;
import java.util.stream.DoubleStream;

public class SumArray {

	public static double sum(double[] numbers) {
        DoubleStream dbStream = Arrays.stream(numbers);

        return dbStream.sum();                
	}
}

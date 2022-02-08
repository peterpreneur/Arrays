package SumArray;

import java.util.Arrays;

public class SumArrayBest {

  public static double sum(double[] numbers) {
    return Arrays.stream(numbers).sum();
  } 
}
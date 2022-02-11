package sortTwoArrays;

import java.util.Comparator;
import java.util.stream.IntStream;

public class ArraySorter1 {
	  public static int[][] sortTwoArrays(int[] arr1, int[] arr2) {
		    int[] sorted1 = sort(arr2, arr1);
		    int[] sorted2 = sort(arr1, arr2);
		    return new int[][] { sorted1, sorted2 };
		  }

		  private static int[] sort(int[] base, int[] toSort) {
		    return IntStream.range(0, base.length).boxed().sorted(Comparator.comparingInt((i) -> base[i]))
		        .mapToInt((i) -> toSort[i]).toArray();
		  }
}

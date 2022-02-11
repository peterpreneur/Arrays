package sortTwoArrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

/*Give you two arrays arr1 and arr2. 
 * They have the same length(length>=2). 
 * The elements of two arrays always be integer.
 * Sort arr1 according to the ascending order of arr2; 
 * Sort arr2 according to the ascending order of arr1. Description is not easy to understand, for example:
*/
public class ArraySorter {
	public static int[][] sortTwoArrays(int[] arr1, int[] arr2){
	//public static void main(String args[]) {
		//int[] arr1 = { 5, 4, 3, 2, 1 };
		//int[] arr2 = { 6, 5, 7, 8, 9 };

		int[] sorted1 = sort(arr2, arr1);
		int[] sorted2 = sort(arr1, arr2);
		return new int[][] { sorted1, sorted2 };
		//int[][]testArray = new int[][] { sorted1, sorted2 };
		
        //for (int i = 0; i < testArray.length; ++i) {
        //    for(int j = 0; j < testArray[i].length; ++j) {
        //    	 System.out.println(testArray[i][j]);
        //    }
        //}
		// return null;
	}

	private static int[] sort(int[] base, int[] toSort) {
		return IntStream.range(0, base.length)
					.boxed()
					.sorted(Comparator.comparingInt((i) -> base[i]))
					.mapToInt((i) -> toSort[i])
					.toArray();
	}
}
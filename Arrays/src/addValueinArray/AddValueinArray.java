package addValueinArray;

import java.util.Arrays;
import java.util.stream.IntStream;

//You have to write a method, that gets two parameter:
//1. An array of arrays with int-numbers
//2. The shifting value

public class AddValueinArray {
	// public static int[] addingShifted(int[][] arrayOfArrays, int shift) {
	public static void main(String[] args) {
		int[][] arrayOfArrays = new int[][] { new int[] { 1, 2, 3, 4, 5, 6 }, new int[] { 7, 7, 7, -7, 7, 7 },
				new int[] { 1, 1, 1, 1, 1, 1 } };
		int shift = 3;

		int numOfInternalArrays = arrayOfArrays.length;
		int lengthOfInternalArray = arrayOfArrays[0].length;

		//int tempArrLen = lengthOfInternalArray + (shift * (numOfInternalArrays - 1));
		int tempArrLen = lengthOfInternalArray * numOfInternalArrays + 9;
		int[] tempArr = new int[tempArrLen];

		int locTempArr = 0;
		for (int y = 0; y < 2; y++) {
		//for (int y = 0; y < numOfInternalArrays; y++) {
			System.arraycopy(arrayOfArrays[y], 0, tempArr, locTempArr + (shift * y), lengthOfInternalArray);
			locTempArr += lengthOfInternalArray;
			System.out.println(Arrays.toString(tempArr));		
		}

		System.out.println(Arrays.toString(tempArr));
		
		
		
		
		//for (int numOfInternalArraysCtr = 0; numOfInternalArraysCtr < numOfInternalArrays; numOfInternalArraysCtr++) {
		//	IntStream.concat(IntStream.of(arrayOfArrays[numOfInternalArraysCtr]),
		//			IntStream.of(arrayOfArrays[numOfInternalArraysCtr]));
		//}

		/*
		 * for (int loop = 0; loop < lengthOfInternalArray; loop++) {
		 * 
		 * tempArr[locTempArr] = arrayOfArrays[numOfInternalArraysCtr].; locTempArr++;
		 * 
		 * }
		 * 
		 * 
		 * for (int locTempArr = 0; locTempArr < tempArrLen; locTempArr++) { for (int
		 * numOfInternalArraysCtr = 0; numOfInternalArraysCtr < numOfInternalArrays;
		 * numOfInternalArraysCtr++) { for (int loop = 0; loop < lengthOfInternalArray;
		 * loop++) {tempArr[locTempArr] = arrayOfArrays[numOfInternalArraysCtr].;
		 * locTempArr++;
		 * 
		 * } } }
		 * 
		 * 
		 * 
		 * 
		 * int locTempArr = 0; for (int y = 0; y < numOfInternalArrays; y++) {
		 * System.arraycopy(arrayOfArrays[y], 0, tempArr, locTempArr,
		 * lengthOfInternalArray); locTempArr += lengthOfInternalArray;
		 * 
		 * System.out.println(Arrays.toString(tempArr)); }
		 * 
		 * int newArrLen = lengthOfInternalArray + (shift * (numOfInternalArrays - 1));
		 * int[] newArr = new int[newArrLen];
		 * 
		 * for (int eachInt = 0; eachInt < newArrLen; eachInt++) { if (eachInt %
		 * lengthOfInternalArray < shift) { System.out.println(tempArr[eachInt]); }
		 * newArr[eachInt] = 0; } System.out.println(Arrays.toString(newArr));
		 */
	}
}

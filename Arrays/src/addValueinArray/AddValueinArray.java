package addValueinArray;

import java.util.Arrays;
import java.util.stream.IntStream;

//You have to write a method, that gets two parameter:
//1. An array of arrays with int-numbers
//2. The shifting value

public class AddValueinArray {
	public static int[] addingShifted(int[][] arrayOfArrays, int shift) {
	//public static void main(String[] args) {
	//	int[][] arrayOfArrays = new int[][] { 
	//			new int[] { 3, 3, 3, 3, 3, 3 }, 
	//			new int[] { 4, 4, 4, 4, 4, 4 },
	//			new int[] { 5, 5, 5, 5, 5, 5 }};
	//	int shift = 3;

		int numOfInternalArrays = arrayOfArrays.length;
		int lengthOfInternalArray = arrayOfArrays[0].length;
		int tempArrLen = lengthOfInternalArray + (shift * (numOfInternalArrays - 1));
		int[] tempArr = new int[tempArrLen];

		int offset = 0;
		for (int i = 0; i < numOfInternalArrays; i++) {
			for (int j = 0; j < arrayOfArrays[i].length; j++) {
				tempArr[j + offset] += arrayOfArrays[i][j];
			}
			offset += shift;
		}
		System.out.println(Arrays.toString(tempArr));
		return tempArr;
	}
}

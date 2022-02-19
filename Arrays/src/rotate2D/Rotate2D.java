package rotate2D;

import java.util.Arrays;
import java.util.stream.Stream;

public class Rotate2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] input = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		
		int[][] tempArr1 = rotate(input);
		
	}

	public static int[][] rotate(int[][] matrix) {

		int numOfIntArrays = matrix.length;
		int lenOfIntArray = matrix[0].length;

		int[][] tempArr = new int[lenOfIntArray][numOfIntArrays];

		int index = 0;
		for (int j = 0; j < numOfIntArrays; j++) {
			for (int i = numOfIntArrays - 1; i >= 0; i--) {
				tempArr[j][index] = matrix[i][j];
				index++;
			}
			index = 0;
		}
		return tempArr;
	}
}

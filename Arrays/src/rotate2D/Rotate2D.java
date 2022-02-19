package rotate2D;

import java.util.Arrays;
import java.util.stream.Stream;

public class Rotate2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] input = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		int[][] tempArr1 = rotate1(input);
		System.out.println(Arrays.deepToString(tempArr1));

		int[][] tempArr2 = rotate2(input);
		System.out.println(Arrays.deepToString(tempArr2));

		int[][] tempArr3 = rotate3(input);
		System.out.println(Arrays.deepToString(tempArr3));

	}

	public static int[][] rotate1(int[][] matrix) {
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

	public static int[][] rotate2(int[][] matrix) {
		int size = matrix.length - 1; // this is really the last index

		for (int layer = 0; layer < (matrix.length / 2); layer++) {
			for (int i = layer; i < size - layer; i++) {
				int topFence = matrix[layer][i]; // starts at top left of layer
				int rightFence = matrix[i][size - layer]; // starts at top right of layer
				int bottomFence = matrix[size - layer][size - i]; // starts at bottom right of layer
				int leftFence = matrix[size - i][layer]; // starts at bottom left of layer

				// rotate 90 degrees clockwise element by element
				matrix[layer][i] = leftFence; // set value walking top fence
				matrix[i][size - layer] = topFence; // set value walking right fence
				matrix[size - layer][size - i] = rightFence; // set value walking bottom fence
				matrix[size - i][layer] = bottomFence; // set value walking left fence
			}
		}

		return matrix;
	}

	public static int[][] rotate3(int[][] matrix) {
		flipVertically(matrix);
		transpose(matrix);

		return matrix;
	}
	
	// This is the first step
	// Flip the matrix vertically
	private static void flipVertically(int[][] matrix) {
		for (int topRow = 0; topRow < (matrix.length / 2); topRow++) {
			int bottomRow = matrix.length - 1 - topRow;

			int[] temp = matrix[topRow];
			matrix[topRow] = matrix[bottomRow];
			matrix[bottomRow] = temp;
		}
	}

	// This is the second step
	// Create matrix transpose
	// A matrix transpose turns each row into a column
	private static void transpose(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = row + 1; col < matrix[0].length; col++) {
				int valueInUpperTriangle = matrix[row][col];
				int valueInLowerTriangle = matrix[col][row];

				matrix[row][col] = valueInLowerTriangle;
				matrix[col][row] = valueInUpperTriangle;
			}
		}
	}
}

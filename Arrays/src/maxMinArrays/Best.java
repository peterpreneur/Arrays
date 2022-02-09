package maxMinArrays;

import java.util.Arrays;

public class Best {

	public static int[] solve(int[] arr) {
		Arrays.sort(arr);
		
		int[] newArr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			newArr[i] = i % 2 == 0 ? arr[arr.length - i / 2 - 1] : arr[i / 2];
		}
		return newArr;
	}
}

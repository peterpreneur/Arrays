package maxSubArraySum;

import java.util.Arrays;
//import java.util.stream.IntStream;

//Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
//should be 6: {4, -1, 2, 1}

//The maximum sum subarray problem consists in finding the 
//maximum sum of a contiguous subsequence in an array or list of integers:

public class Max {
	public static int sequence(int[] arr) {
		int arrLen = arr.length;
		int seq = 4;
		int maxVal = 0;
		int currVal = 0;
		for (int i = 0; i <= (arrLen - seq); i++) {
			currVal = Arrays.stream(arr, i, (i + seq)).sum();
			//System.out.println("i=" + i + " currVal=" + currVal);
			if (currVal > maxVal) {
				maxVal = currVal;
			}
		}
		//System.out.println(Arrays.toString(arr));
		return maxVal;
	}
}
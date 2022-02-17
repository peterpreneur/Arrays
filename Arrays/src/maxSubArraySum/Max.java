package maxSubArraySum;

import java.util.Arrays;
//import java.util.stream.IntStream;

//Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
//should be 6: {4, -1, 2, 1}

//The maximum sum subarray problem consists in finding the 
//maximum sum of a contiguous subsequence in an array or list of integers:

public class Max {
	public static void main (String [] Args ) {
		//int[] arr = {};
		int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int arrLen = arr.length;
		int maxVal = 0;
		int currVal = 0;
		for (int i=0; i < (arrLen - 4); i++) {
			currVal = Arrays.stream(arr,i,4).sum();	
			if (currVal > maxVal) {
				maxVal = currVal;
			}
		}
		
		System.out.println(maxVal);
	}
	
	//public static int sequence(int[] arr) {
	//return sum;
	//}
}
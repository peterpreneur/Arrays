package maxMinArrays;

import java.util.stream.IntStream;

/*In this Kata, you will be given an array of unique elements, 
 * and your task is to rearrange the values so that the first max value 
 * is followed by the first minimum, followed by second max value 
 * then second min value, etc.
 * For example: solve([15,11,10,7,12]) = [15,7,12,10,11]
 * The first max is 15 and the first min is 7. 
 * The second max is 12 and the second min is 10 and so on.*/

public class Solution {

	//public static void main(String[] args) {
	public static int[] solve (int[] arr){
		//int[] arr = { 15, 11, 10, 7, 12 };

		int[] sortedArr = IntStream.of(arr).distinct().sorted().toArray();
		int maxIndex = sortedArr.length;
		int[] newArr = new int[maxIndex];
		int maxCnt = maxIndex - 1;
		int minCnt = 0;

		for (int i = 0; i < maxIndex; i++) {
			if ((i % 2) == 0) {
				newArr[i] = sortedArr[maxCnt];
				//System.out.println(i + " " + newArr[i] + " " + maxCnt);
				maxCnt--;
			} else {
				newArr[i] = sortedArr[minCnt];
				//System.out.println(i + " " + newArr[i] + " " + minCnt);
				minCnt++;
			}
		}
		//System.out.println(Arrays.toString(newArr));
		return newArr;
	}
}

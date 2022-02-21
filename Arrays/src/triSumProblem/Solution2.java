package triSumProblem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution2 {
	public static void main(String[] args) {
		int[] A = { -3, -1, 1, 0, 2, 10, -2, 8 };
		Arrays.sort(A); // Sorting array of integers can take O(n) time via Bucket Sort or Radix Sort

		// Hash set is used to avoid the duplicate
		Set<List<Integer>> allThreeSums = new HashSet<>();
		int secondToLastIndex = A.length - 2;

		// Find two sum function should run for each value of i
		for (int i = 0; i < secondToLastIndex; i++) {
			findTwoSum(i, A, allThreeSums);
		}
		
		System.out.println(allThreeSums.toString());
		// return new ArrayList<>(allThreeSums);
	}

	private static void findTwoSum(int rootIndex, int[] A, Set<List<Integer>> allThreeSums) {
		int left = rootIndex + 1;
		int right = A.length - 1;

		// Loop till left index is less than right index
		while (left < right) {
			int threeNumberSum = A[rootIndex] + A[left] + A[right];
			// If we get the ans than increase left index
			// Decrease right index
			// And add the solution to the set
			if (threeNumberSum == 0) {
				allThreeSums.add(Arrays.asList(A[rootIndex], A[left++], A[right--]));
			} else if (threeNumberSum < 0) {
				// If sum<0 only increase left index to increase the value of sum
				left++;
			} else {
				// If sum>0 only decrease the right index to decrease the value of sum
				right--;
			}
		}
	}
}

package maxMinArrays;

import java.util.*;

public class Best2 {
	public static int[] solve(int[] arr) {
		List<Integer> newArr = new ArrayList<Integer>();
		Arrays.sort(arr);
		
		for (int i = 0, j = arr.length - 1; i <= j; ++i, --j) {
			if (i != j)
				newArr.add(arr[j]);
			newArr.add(arr[i]);
		}
		
		int[] test = newArr.stream().mapToInt(i -> i).toArray();
		System.out.println(Arrays.toString(test));
		return test;
	}
}

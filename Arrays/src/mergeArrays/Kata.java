package mergeArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//Write a function that merges two sorted arrays into a single one. 
//The arrays only contain integers. 
//Also, the final outcome must be sorted and not have any duplicate.

public class Kata {
	public static int[] mergeArrays(int[] first, int[] second) {
		// public static void main(String args[]) {
		// int[] first = { 0, 1, 3, 2, 3 };
		// int[] second = { 4, 5, 1, 3, 6, 7 };

		int arr1Len = first.length;
		int arr2Len = second.length;
		int[] combinedArray = new int[arr1Len + arr2Len];

		System.arraycopy(first, 0, combinedArray, 0, arr1Len);
		System.arraycopy(second, 0, combinedArray, arr1Len, arr2Len);
		System.out.println(Arrays.toString(combinedArray));

		// HashSet to remove duplicates
		HashSet<Integer> setWithNoDuplicates = new HashSet<>();
		for (int m = 0; m < combinedArray.length; m++) {
			setWithNoDuplicates.add(combinedArray[m]);
		}

		// So, now iterate setWithNoDuplicates and add its elements into new array
		// called mergedArrayWithNoDuplicates
		Iterator it = setWithNoDuplicates.iterator();
		int[] mergedArrayWithNoDuplicates = new int[setWithNoDuplicates.size()];

		int n = 0;
		// Adding all elements of setWithNoDuplicates into mergedArrayWithNoDuplicates
		while (it.hasNext()) {
			mergedArrayWithNoDuplicates[n] = (int) it.next();
			n++;
		}

		System.out.println("Final" + Arrays.toString(mergedArrayWithNoDuplicates));
		Arrays.sort(mergedArrayWithNoDuplicates);
		return mergedArrayWithNoDuplicates;
	}	
}

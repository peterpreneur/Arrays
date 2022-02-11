package sortTwoArrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArraySorterTests1 {
	@Test
	public void exampleTests() {
		int[] a1 = { 5, 4, 3, 2, 1 };
		int[] a2 = { 6, 5, 7, 8, 9 };
		assertEquals(new int[][] { { 4, 5, 3, 2, 1 }, { 9, 8, 7, 5, 6 } }, ArraySorter1.sortTwoArrays(a1, a2));
		int[] a3 = { 2, 1, 3, 4, 5 };
		int[] a4 = { 5, 6, 7, 8, 9 };
		assertEquals(new int[][] { { 2, 1, 3, 4, 5 }, { 6, 5, 7, 8, 9 } }, ArraySorter1.sortTwoArrays(a3, a4));
		int[] a5 = { 5, 6, 9, 2, 6, 5 };
		int[] a6 = { 3, 6, 7, 4, 8, 1 };
		assertEquals(new int[][] { { 5, 5, 2, 6, 9, 6 }, { 4, 3, 1, 6, 8, 7 } }, ArraySorter1.sortTwoArrays(a5, a6));

	}
}

package addValueinArray;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.runners.JUnit4;

public class AddValueinArrayTest {
	@Test
	public void basicTests() {
		int[][] arrayOfArrays = new int[][] { new int[] { 1, 2, 3, 4, 5, 6 }, new int[] { 7, 7, 7, 7, 7, 7 } };
		int[] expected = new int[] { 8, 9, 10, 11, 12, 13 };
		int[] result = AddValueinArray.addingShifted(arrayOfArrays, 0);
		assertNotNull(result);
		assertEquals(Arrays.toString(expected), Arrays.toString(result));

		arrayOfArrays = new int[][] { new int[] { 1, 2, 3, 4, 5, 6 }, new int[] { 7, 7, 7, 7, 7, 7 } };
		expected = new int[] { 1, 2, 3, 11, 12, 13, 7, 7, 7 };
		result = AddValueinArray.addingShifted(arrayOfArrays, 3);
		assertNotNull(result);
		assertEquals(Arrays.toString(expected), Arrays.toString(result));

		arrayOfArrays = new int[][] { new int[] { 1, 2, 3, 4, 5, 6 }, new int[] { 7, 7, 7, -7, 7, 7 },
				new int[] { 1, 1, 1, 1, 1, 1 } };
		expected = new int[] { 1, 2, 3, 11, 12, 13, -6, 8, 8, 1, 1, 1 };
		result = AddValueinArray.addingShifted(arrayOfArrays, 3);
		assertNotNull(result);
		assertEquals(Arrays.toString(expected), Arrays.toString(result));
	}
}

package sortArrays1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import java.util.Random;

public class SortArrayTest2 {
	@Test
	public void intArrayTests() {
		int[] ai = { 1, 2, 3 };
		int[] uai = { 2, 3, 1 };
		assertEquals(ai[0], SortArray2.sortArray(uai)[0]);
		assertEquals(ai[1], SortArray2.sortArray(uai)[1]);
		assertEquals(ai[2], SortArray2.sortArray(uai)[2]);
	}
}
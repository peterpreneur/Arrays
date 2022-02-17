package maxSubArraySum;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaxSequenceTest {
	@Test
	public void testEmptyArray() throws Exception {
		assertEquals("Empty arrays should have a max of 0", 
				0, 
				Max.sequence(new int[] {}));
	}

	@Test
	public void testExampleArray() throws Exception {
		assertEquals("Example array should have a max of 6", 
				6,
				Max.sequence(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
	}
	
	@Test
	public void testExampleArray1() throws Exception {
		assertEquals("Example array should have a max of 120", 
				53,
				Max.sequence(new int[] { 
				13, -18, 25, -19, -9, 21, -22, -26, 
				15, 23, 24, -9, 
				7, -16, 15, 25, 4, -28, 29, -6, 0, 25, 12, 
				-23, 9, -8, 20, -15, 2, 0, 14, -2, -17, -1, 12, 
				-14, -8, -16, -8, 28, -15, -7, 1, -6, 13, 0, 24, 
				-6, 19, -1, -16, -25, 27}));
	}

}
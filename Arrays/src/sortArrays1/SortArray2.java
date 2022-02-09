package sortArrays1;

import java.util.Arrays;

public class SortArray2 {
	public static <T> T sortArray(T array) {
		if (array instanceof int[])
			Arrays.sort((int[]) array);
		else if (array instanceof long[])
			Arrays.sort((long[]) array);
		else if (array instanceof float[])
			Arrays.sort((float[]) array);
		else if (array instanceof double[])
			Arrays.sort((double[]) array);
		else if (array instanceof Integer[])
			Arrays.sort((Integer[]) array);
		else
			Arrays.sort((String[]) array);
		return array;
	}
}
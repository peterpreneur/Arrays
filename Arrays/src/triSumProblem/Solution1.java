package triSumProblem;

public class Solution1 {
	int lenA = A.length;
	int a;
	int b;
	int c;
	Boolean flg = false;
	List<List<Integer>> aList = new ArrayList<List<Integer>>();
	List<Integer> a1 = new ArrayList<Integer>();

	for (int i = 0; i < lenA; i++) {
		a = A[i];
		if (a >= 0) {
			flg = true;
		}
		for (int j = i + 1; j < lenA; j++) {
			b = A[j];
			if (((flg == true) && b < 0) || ((flg == false) && b >= 0)) {
				c = -(a + b);
				for (int k = j + 1; k < lenA; k++) {
					if (c == A[k]) {
						a1.add(a);
						a1.add(b);
						a1.add(c);
						aList.add(a1);
					}
				}
			}
		}
	}
}

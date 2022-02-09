package maxMinArrays;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.runners.JUnit4;

public class SolutionBest2Test{    
    @Test
    public void basicTests(){     
        assertArrayEquals(new int[]{15,7,12,10,11},Best2.solve(new int[]{15,11,10,7,12}));
        assertArrayEquals(new int[]{15,7,12,10,11},Best2.solve(new int[]{15,11,10,7,12}));
        assertArrayEquals(new int[]{15,7,12,10,11},Best2.solve(new int[]{15,11,10,7,12}));    
    }
}

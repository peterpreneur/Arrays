package SumArray;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SumArrayBestTest {

  @Test
  public void testSum() {
    assertEquals(0,      SumArrayBest.sum(new double[] { }),                1e-4);
    assertEquals(-2.398, SumArrayBest.sum(new double[] {-2.398}),           1e-4);
    assertEquals(6,      SumArrayBest.sum(new double[] {1, 2, 3}),          1e-4);
    assertEquals(6.6,    SumArrayBest.sum(new double[] {1.1, 2.2, 3.3}),    1e-4);
    assertEquals(9.2,    SumArrayBest.sum(new double[] {1, 5.2, 4, 0, -1}), 1e-4);
    assertEquals(320,    SumArrayBest.sum(new double[] {30, 89, 100, 101}), 1e-4);
  }
}

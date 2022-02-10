package addValueinArray;

public class Best
{
  public static int[] addingShifted(int[][] arrayOfArrays, int shift)
  {
    int [] arrayOfSums = new int[arrayOfArrays[0].length + shift * (arrayOfArrays.length -1) ];
    int offset=0;
    for (int i = 0 ; i < arrayOfArrays.length ; i++) {
      for (int j = 0 ; j < arrayOfArrays[i].length ; j++ ) {
        arrayOfSums[j+offset] += arrayOfArrays[i][j];
      }
      offset += shift;
    }
    return arrayOfSums;
  }
}
public class MultiDimensionalArray {

  public static void main(String[] args) {
    int z = 2;
    int y = 4;
    int x = 3;
    int counter = 1;
    int[][][] a = new int[z][y][x];
    for (int i = 0; i < z; i++) {
      for (int j = 0; j < y; j++) {
        for (int k = 0; k < x; k++) {
          a[i][j][k] = counter++;
        }
      }
    }

    for (int i = 0; i < z; i++) {
      for (int j = 0; j < y; j++) {
        for (int k = 0; k < x; k++) {
          System.out.print(a[i][j][k]+" ");
        }
        System.out.println();
      }
      System.out.println();
      System.out.println();
      System.out.println();
    }
  }
}

package recursion.abnormal;

import recursion.normal.Recursion;

public class RecursionStatic {

  static void oneToN(int n) {
    if (n == 1) {
      System.out.println(n);
      return;
    }
    oneToN(n - 1);
    System.out.println(n);
    return;
  }

  public static void main(String[] args) {
    Recursion recursion = new Recursion();
    recursion.factorial(10);
  }
}

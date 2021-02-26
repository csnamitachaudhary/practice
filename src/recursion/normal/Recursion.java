package recursion.normal;

public class Recursion {

  int sumUpToN(int n) {
    if (n == 0) {
      return 0;
    }
    int sum = n + sumUpToN(n - 1);
    return sum;
  }

  int fibonacci(int n) {
    if (n <= 1) {
      return 0;
    }
    if (n == 2) {
      return 1;
    }
    int nth = fibonacci(n - 1) + fibonacci(n - 2);
    return nth;
  }

   public long factorial(int n) {
    if (n <= 1) {
      return 1;
    }
    return n * factorial(n - 1);
  }

  int sum(int a[], int length) {
    if (length == 0) {
      return 0;
    }
    return a[length - 1] + sum(a, length - 1);
  }

  void table(int n, int upto) {
    if (upto == 0) {
      return;
    }
    table(n, upto - 1);
    System.out.println(n * upto);
  }

  void naturalNum(int n) {
    if (n == 0) {
      return;
    }
    naturalNum(n - 1);
    System.out.println(n);
  }

  int power(int a, int b) {
    System.out.println("Inside Power: A: " + a + " B:" + b);
    if (b == 0) {
      return 1;
    }
    int pow = multiply(a, power(a, b - 1));
    System.out.println(pow);
    return pow;
  }

  int multiply(int n, int m) {
    System.out.println("Inside multiply: N: " + n + " M:" + m);
    if (n == 0 || m == 0) {
      return 0;
    }
    int mul = n + multiply(n, m - 1);
    return mul;
  }
}
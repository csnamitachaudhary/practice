import java.util.List;
import java.util.Scanner;

public class BasicCalculator {

  public double sum(double... varargs) {
    double sum = 0;
    for (double vararg : varargs) {
      sum = sum + vararg;
    }
    return sum;
  }

  public static void main(String[] args) {
    List<Integer> a;
    Scanner scanner = new Scanner(System.in);
    double num1, num2, num3, num4, num5;
    BasicCalculator bc = new BasicCalculator();
    num1 = scanner.nextDouble();
    num2 = scanner.nextDouble();
    num3 = scanner.nextDouble();
    num4 = scanner.nextDouble();
    num5 = scanner.nextDouble();
    double sumOfN = bc.sum(num1, num2, num3);
    System.out.println("the sum is: " + sumOfN);
  }


}

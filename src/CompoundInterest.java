import java.util.Scanner;

public class CompoundInterest {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double P = input.nextDouble();
    double R = input.nextDouble();
    int T = input.nextInt();
    double CI ;
    for(int i=1; i<=T; i++){
      CI = (P*R)/100;
      System.out.println("Compound Interest for "+i+" year is : "+CI);
      P = P + CI;
    }
  }

}

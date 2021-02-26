import java.util.Scanner;

public class Average {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int counter = input.nextInt() ;
    int grade;
    int total = 0;
    double avg ;
    for (int i = 0; i<counter; i++){
      grade = input.nextInt();
      total += grade;
    }
    avg = total/counter;
    System.out.println("Your avg is: "+avg);
    System.out.println(avg >33 ? "Your total marks is: "+total:"0");
  }

}

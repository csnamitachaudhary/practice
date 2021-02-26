import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserInput {

  public static void main(String[] args) throws IOException {
    Scanner table = new Scanner(System.in);
    int a = table.nextInt();
    FileWriter myWriter = new FileWriter("/Users/infoworks/Downloads/table.txt");
    for (int i = 1; i <= 10; i++) {
      int b = a * i;
      myWriter.write(String.valueOf(b)+"\n");
    }
    myWriter.close();
  }
}

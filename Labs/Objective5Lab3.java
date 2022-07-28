import java.util.Scanner;
import static java.lang.System.out;

public class Objective5Lab3{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    out.println("Please enter a number: ");
    int userNum = scanner.nextInt();

    if(userNum > 0){
      out.println("The number is positive");
    }
    else if (userNum < 0){
      out.println("The number is negative");
    }
    else{
      out.println("The number is 0");
    }
  }
}

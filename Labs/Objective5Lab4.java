import java.util.Scanner;
import static java.lang.System.out;

public class Objective5Lab4{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    out.println("Please input a number: ");
    int num = scanner.nextInt();

    if(num % 2 == 0){
      out.println("Your number is even");
    }
    else{
      out.println("Your number is odd");
    }
  }
}

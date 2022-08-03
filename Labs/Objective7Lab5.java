import java.util.Scanner;
import static java.lang.System.out;

public class Objective7Lab5{
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    int selection;

    while(true){

      out.println("_____Menu_____");
      out.println("1: Say Hello");
      out.println("2: List my favorite foods");
      out.println("3: Exit\n");

      selection = scanner.nextInt();

      if(selection == 1){
        out.println("Hello human");
      }
      else if(selection == 2){
        out.println("Apples, Bananas, Coconuts");
      }
      else if(selection == 3){
        out.println("Goodbye");
        break;
      }
    }

    scanner.close();

  }
}

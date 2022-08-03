import java.util.Scanner;
import static java.lang.System.out;

public class Objective9Lab3{
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  int selection;

  while(true){
    printMenu();
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

  public static void printMenu() {
    out.println("_____Menu_____");
    out.println("1: Say Hello");
    out.println("2: List My favorite foods");
    out.println("3: Exit");
    out.println();
  }
}

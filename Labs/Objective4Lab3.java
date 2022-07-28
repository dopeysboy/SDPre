import java.util.Scanner;
import static java.lang.System.out;

public class Objective4Lab3{
  public static void main(String[] args){
    int birthYear, age, currentYear;

    currentYear = 2022;

    Scanner input = new Scanner(System.in);
    out.println("How old are you?");

    age = input.nextInt();

    birthYear = currentYear - age;

    out.println("You were born in " + birthYear);
    input.close();
  }
}

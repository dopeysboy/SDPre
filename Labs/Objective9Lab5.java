import java.util.Scanner;
import static java.lang.System.out;

public class Objective9Lab5 {

  public static void main(String[] args) {
    Scanner kb = new Scanner (System.in);
		double num1, num2;
		boolean keepGoing = true;
		int choice;
		double answer = 0.0;

    out.print("Please give me a number: ");
    num1 = kb.nextDouble();

    out.print("\nPlease give me a second number: ");
    num2 = kb.nextDouble();

		while (keepGoing) {
			printMenu();
			out.print("Which would you like to do? ");
			choice = kb.nextInt();

			switch (choice) {
        case 1:
          out.println(num1 + " + " + num2 + " = " + findSum(num1, num2));
          break;
        case 2:
          out.println("The average of " + num1 + " and " + num2 + " is: " + findAverage(num1, num2));
          break;
        case 3:
          out.println("The amount in tax to be collected from a purchase of " + num1 + " and " + num2 + " is: " + calcTax(num1, num2));
          break;
        case 4:
          out.println("You've chosen to quit.");
          keepGoing = false;
          break;
        default:
          out.println("Invalid entry. Please try again.");
          break;
      }
    }

		kb.close();

	}

	public static void printMenu() {
		out.println();
		out.println("========= MENU =========");
		out.println("|                      |");
		out.println("|   1. Add Numbers     |");
		out.println("|   2. Find Average    |");
		out.println("|   3. Calculate Tax   |");
		out.println("|   4. Exit            |");
		out.println("|                      |");
		out.println("========================");
		out.println();
	}

	public static double findSum(double x, double y) {
		double sum = x + y;
		return sum;
	}

  public static double findAverage(double x, double y){
    double avg = (x + y) / 2;
    return avg;
  }

  public static double calcTax(double x, double y){
    double rate = .0831;
    double tax = (x + y) * rate;
    return tax;
  }
}

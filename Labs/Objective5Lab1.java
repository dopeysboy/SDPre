import static java.lang.System.out;

public class Objective5Lab1 {
  public static void main(String[] args){
    int num1 = 5;
    int num2 = 15;

    if(num1 > num2){
      out.println(num1 + " is bigger than " + num2);
    }
    else if(num2 > num1){
      out.println(num2 + " is bigger than " + num1);
    }
    else if (num1 == num2){
      out.println("The two numbers are equal");
    }
  }
}

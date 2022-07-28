import static java.lang.System.out;

public class Objective5Lab2{
  public static void main(String[] args){
    String string1 = "banana";
    String string2 = "bacon";
    String string3 = "banana";

    if(string1.equals(string2)){
      out.println(string1 + " is equivalent to " + string2);
    }
    else {
      System.out.println(string1 + " is not equivalent to " + string2);
    }
    if(string1.equals(string3)){
      out.println(string1 + " is equivalent to " + string3);
    }
    else {
      System.out.println(string1 + " is not equivalent to " + string3);
    }
  }
}

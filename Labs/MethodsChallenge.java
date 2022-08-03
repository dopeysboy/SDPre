//20 x's 10 long
public class MethodsChallenge{

  static String exes = "XXXXXXXXXXXXXXXXXXXX";

  public static void main(String[] args){
    printSquareFor();
    System.out.println();
    printRectangle();
  }

  public static void printSquareFor(){
    for(int i = 0; i <= 9; i++){
      System.out.println(exes);
    }
  }

  public static void printSquareWhile(){
    int i = 0;
    while(i <= 9){
      System.out.println(exes);
      i++;
    }
  }

  public static void printRectangle(){
    printSquareFor();
    printSquareWhile();
  }
}

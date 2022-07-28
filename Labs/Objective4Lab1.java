import java.util.Scanner;

public class Objective4Lab1{
  public static void main(String[] args){

    Scanner keyboard = new Scanner(System.in);

    String fname, lname, favoriteAnimal, favoriteFood, favoriteSong;

    System.out.println("What is your first name?");
    fname = keyboard.nextLine();

    System.out.println("What is your last name?");
    lname = keyboard.nextLine();

    System.out.println("What is your favorite animal?");
    favoriteAnimal = keyboard.nextLine();

    System.out.println("What is your favorite food?");
    favoriteFood = keyboard.nextLine();

    System.out.println("What is your favorite song?");
    favoriteSong = keyboard.nextLine();

    System.out.println(" My name is " + fname + " " + lname + ".\nMy favorite animal is the " + favoriteAnimal +".\nMy favorite food is " + favoriteFood + ".\nMy favorite song is " + favoriteSong + ".");
  }
}

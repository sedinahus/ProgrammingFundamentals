/**
 * Sedina Husanovic
 * This program will compute the minutes you worked into seconds and hours
 * Jan 28, 2019
 */ 
import java.util.Scanner;
public class HW1
{
  public static void main(String[] args)
  { // add scanner to use user's inputs
    Scanner keyboard = new Scanner(System.in);
    // ask user how many minutes they worked
    System.out.println(" How many mintues did you work today: ");
    // create variable for the minutes from the user
    double minutes = keyboard.nextDouble();
    // create variable sec and times 60 to get total sec
    double seconds = minutes * 60;
      // create variable hour and times 60 to get total hours
    double hours = minutes / 60;
      // Tells you final calculations
    System.out.println("That is " + seconds + " seconds and " + hours + " hours.");
    
  }
} 
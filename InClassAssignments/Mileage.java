import java.util.Scanner;
public class Mileage
{
  public static void main(String[] args)
  {
    // Add your declaration and code here.
    System.out.println("This program will calculate mileage.");
    // put in the scanner to ask the user for input
    Scanner keyboard = new Scanner(System.in);
    //ask user for miles
    System.out.println("How many miles were driven: ");
    //create variable for miles driven, implement the scanner system
    double mileDriven = keyboard.nextDouble();
    //ask user for gallons used
    System.out.println("How many gallons were used: ");
    //create variable for gallons, implement the scanner system
    double gallonUsed = keyboard.nextDouble();
    //calculate the miles per gallon
    double mpg = mileDriven / gallonUsed;
    //tells the user what the miles per gallon is
    System.out.println("Miles per gallon: " + mpg);
    
  }
}

/** first you have to put in the scanner class so that you can use the code from the user input,
  * then you promt the user a question
  * make a variable from the use's input (make sure to classify its type correctly), whatever variable used for the scanner make sure to bring it down when for the new variable you created for your user's input
  * then promt the user your next question, and repeat line 28
  * write in your formula using all your variables
  * then the final print statment will hold your final calculation
  */

// program to show basic output and input
// import scanner class
import java.util.Scanner;

public class SecondProgram
{
  public static void main (String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter total cost: "); // giving a prompt
    double totalCost = keyboard.nextDouble();
    
    System.out.println("Enter number of items: ");
    int itemCount = keyboard.nextInt();
    
    double pricePerItem = totalCost/itemCount;
    
    System.out.println("Price per item is: " + pricePerItem );
    
    
  } // end of main
  
} // end of class
  
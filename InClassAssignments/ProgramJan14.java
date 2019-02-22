// import scanner class, to be able to read from keyboard
import java.util.Scanner;

public class ProgramJan14
{
  public static void main(String[] args)
  {
    //Create an i nstance of Scanner class
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Enter your name: ");
    String yourName = keyboard.nextLine();
    
    System.out.println("Your name is: " + yourName);
    
    System.out.println("Enter your GPA: ");
    double yourGpa = keyboard.nextDouble();
    
    System.out.println("Your GPA is: " + yourGpa);
    
    
  } //end of main method
} // end of class
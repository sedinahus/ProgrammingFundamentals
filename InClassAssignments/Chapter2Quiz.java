import java.util.Scanner;
public class Chapter2Quiz 
{

  public static void main(String[] args) 
  { 
    // this program calculates the perimeter of a square //(4 * sideLength) and outputs it to
    // the console


    double sideLength;

    // ADD YOUR CODE HERE- Prompt user and read in //sideLength
    System.out.println("Please enter the value for the perimeter: ");
    Scanner input = new Scanner(System.in);
    double sideLength = input.nextDouble();

    // DO NOT CHANGE BELOW THIS COMMENT
    double perimeter = 4* sideLength;
    System.out.println("The perimeter of the square is " + perimeter);

 } 
}





import java.util.Scanner; //to be able to read from keyboard

public class ComputeArea
{
  public static void main(String[] args)
  {
    double radius;
    double area;
    
    //create an instance of Scanner
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Enter radius of the circle: ");
    radius = keyboard.nextDouble();
    
    area = 3.141519 * radius * radius;
    
    System.out.println("Area of the circle is: " + area);
   
  } //end of main
} //end of class
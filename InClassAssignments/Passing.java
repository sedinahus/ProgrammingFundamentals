import java.util.Scanner;
public class Passing
{
  public static void main(String[] args)
  {
   Scanner input = new Scanner(System.in);
   System.out.println("Please enter grade (0 to 100)");
   double grade = input.nextDouble();
   
   if (grade >= 70)
     System.out.println("You pass");
   else
     System.out.println("You fail");
  }
}
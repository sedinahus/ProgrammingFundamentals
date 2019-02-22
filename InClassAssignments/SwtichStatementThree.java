import java.util.Scanner;

public class SwtichStatementThree
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    //System.out.println(Math.random());
    int value1 = (int) (Math.random() * 10);
    int value2 = (int) (Math.random() * 10);
    
    if(value1 < value2)
    {
      int temp = value1;
      value1 = value2;
      value2 = temp;
    }
    
    System.out.println("What is " + value1 + " - " + value2 + " = ?");
    int userResponse = input.nextInt();
    
    int result = value1 - value2;
    
    if(result == userResponse)
      System.out.println("That is correct!");
    else System.out.println("That is incorrect.");
  }
}
import java.util.Scanner;
public class QuizTwo
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("What is the miles per hour: ");
    
    double mph = input.nextDouble();
    
    System.out.println("What is the total minutes driven: ");
    
    double min = input.nextDouble();
    
    double distance = (min * 60) / mph;
    
    System.out.println("The total distance driven is " + distance);
    
    
  }
}
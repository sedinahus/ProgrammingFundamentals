public class EvenOddZero
{
  public static void main(String[] args)
  {
    int number = 10;
    if(number == 0)
      System.out.println("The number is zero!");
    else if(number % 2 == 0)
      System.out.println("The number is even!");
    else System.out.println("The number is odd!");
  }
}
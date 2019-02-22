import java.util.Scanner;
public class ChineseConversion
{
  public static void main(String[] args)
  {
    char userInput;
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter 0 to convert USD to Chinese RMB, or 1 to convert RMB to USD: ");
    userInput = input.next().charAt(0); //read input string, get first character
    
    switch(userInput)
    {
      case '0':
        System.out.println("You selected to convert USD to chinese RMB.");
        double dollarAmount = input.nextDouble();
        double rmbAmount = dollarAmount * 6.75;
        System.out.println("RMB: " + rmbAmount);
        break;
      case '1':
        System.out.println("You selected to convert RMB to USD");
        double rmb = input.nextDouble();
        double dollarAm = rmb / 6.75;
        System.out.printf("USD: %.2f \n", dollarAm);
        break;
      default:
        System.out.println("Your input is not recognized, try again!");
        break;
    }
  }
}
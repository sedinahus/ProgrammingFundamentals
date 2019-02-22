import java.util.Scanner;

public class EuropeTrip
{
  public static void main(String[] args)
  {
    final double EXCHANGE_RATE = 1.14051;
    //calculates currency, converts Euros to USD
    
    //create scanner object
    Scanner input = new Scanner(System.in);
    
    //give promt for input
    System.out.println("Enter number of euros to convert to USD$: ");
    
    //declare and assign statement
    double numberOfEuros = input.nextDouble();
    
    //declare and assign/calculate value
    double numberOfDollars = numberOfEuros * EXCHANGE_RATE;
    
    //output statement, f(float) we put "%.2f" to get 2 decimal places, "\n" means new line gets rid of blinking cursor
    System.out.printf("Number of dollars needed is $%.2f\n", numberOfDollars);
  }
}
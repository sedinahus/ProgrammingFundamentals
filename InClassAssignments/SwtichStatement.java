import java.util.Scanner;

public class SwtichStatement
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter your year of birth to find Chinese zodiac sign: ");
    int birthYear = input.nextInt();
    
    switch(birthYear % 12)
    {
      case 0:
        System.out.println(birthYear + " is the year of Monkey.");
        break;
        
      case 1:
        System.out.println(birthYear + " is the year of Rooster.");
        break;
        
      case 2:
        System.out.println(birthYear + " is the year of Dog.");
        break;
        
      case 3:
        System.out.println(birthYear + " is the year of Pig.");
        break;
        
      case 4: 
        System.out.println(birthYear + " is the year of Rat.");
        break;
        
      case 5:
        System.out.println(birthYear + " is the year of Ox.");
        break;
        
      case 6:
        System.out.println(birthYear + " is the year of Tiger.");
        break;
        
      case 7:
        System.out.println(birthYear + " is the year of Rabbit.");
        break;
        
      case 8:
        System.out.println(birthYear + " is the year of Dragon.");
        break;
        
      case 9:
        System.out.println(birthYear + " is the year of Snake.");
        break;
        
      case 10:
        System.out.println(birthYear + " is the year of Horse.");
        break;
        
      case 11:
        System.out.println(birthYear + " is the year of Sheep.");
        break;
    }
  }
}
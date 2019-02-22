import java.util.Scanner;
public class SentenceReader
{
  public static void main(String[] args)
  {

    Scanner input = new Scanner(System.in);
    System.out.println("Please type in a sentence: ");
    String sentence;
    sentence = input.nextLine();
    System.out.println("Did you say, " + sentence);
    
  }
}
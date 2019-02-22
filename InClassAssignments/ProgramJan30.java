import java.util.Scanner;
public class ProgramJan30
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner (System.in);
    char yourGrade;
    //char yourGrade = ' '; you dont need this anymore, dont get initialization error
    
    System.out.println("Enter your score: ");
    double yourScore = input.nextDouble();
    
    
    if (yourScore >= 90)
      yourGrade = 'A';
    else
      if (yourScore >= 80 && yourScore < 90)
          yourGrade = 'B';
      else
        if (yourScore >= 70 && yourScore < 80)
            yourGrade = 'C';
        else if (yourScore >= 60)
                 yourGrade = 'D';
              else yourGrade = 'F';
    
    
    
    
//    if (yourScore >= 90)   one way to write it
//      yourGrade = 'A';
//    if (yourScore >= 80 && yourScore < 90)
//      yourGrade = 'B';
//    if (yourScore >= 70 && yourScore < 80)
//      yourGrade = 'C';
    
    System.out.println("Your grade: " + yourGrade);





//    double drivingTestScore = 75;
//    
//    if (drivingTestScore >= 70) //semi colon not required on if statements
//    {
//      System.out.println("You passed the test!");
//    }
//    //curlies are required if you have multiple statements within IF-blocks
//    if(drivingTestScore < 70) // no semis
//    {
//      System.out.println("You failed the test!");
//      System.out.println("Study the guide for 5 hours before retaking."); //Put a 3rd curly because leaving this statement would print it even if we pass
//    }
  }
}
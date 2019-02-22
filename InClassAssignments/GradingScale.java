import java.util.Scanner;
public class GradingScale
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    //declare and initialize
    System.out.println("Ennter assignment score: ");
    int assignScore = input.nextInt();
    System.out.println("Enter project score: ");                
    int projectScore = input.nextInt();
    System.out.println("Enter exam score: ");
    int examScore = input.nextInt();
    
    double averageScore;
    String finalGrade = " "; //need space here bc initialization error to go away
    
    
    averageScore = assignScore * (20.0/100) + projectScore * (30.0/100) + examScore * (50.0/100);
    System.out.println("Average score: " + averageScore);
    
    double roundedAverage = Math.round(averageScore); 
    System.out.println("Rounded average: " + roundedAverage);
    
    if(roundedAverage >= 93)
      finalGrade = "A";
    else if (roundedAverage >= 90)
      finalGrade = "A-";
    else if (roundedAverage >= 87)
      finalGrade = "B+";
    else if (roundedAverage >= 83)
      finalGrade = "B";
    else if (roundedAverage >= 80)
      finalGrade = "B-";
    else finalGrade = "C";
    System.out.println("final grade: " + finalGrade);

//    if(roundedAverage >= 90 && roundedAverage < 93)
//      finalGrade = "A-"
  }
}
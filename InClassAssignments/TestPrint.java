public class TestPrint
{
  public static void main(String[] args)
  {
    int num1 = 45;
    double num2 = 5.0;
    //System.out.printf("The result of %d divided by %d is %d" , num1, num2, num1/num2); printf is for formatting your print statement
    //System.out.printf("The result of %.2f divided by %d is %010.3f\n",num2,num1,num2/num1);
    System.out.printf("The result of %.2f divided by %d is %.2f%%.\n", num2, num1, 100*(num2/num1));
    
  }
}
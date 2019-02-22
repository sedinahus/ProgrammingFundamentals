public class FtoC
{
  public static void main(String[] args)
  {
    int fTemp = 50;
    
    int cTemp = (int) ((5 / 9.0) * (fTemp - 32)); //convert decimal value to int
     
    System.out.println("Temp in Celcius: " + cTemp);
  } 
}
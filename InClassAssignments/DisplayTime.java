public class DisplayTime
{
  public static void main(String[] args)
  {
    // declare a variable and assign a value
    long numSeconds = 345678923456L; //always put "L" at the end of the sequence
    
    long numMinutes = numSeconds/60; // integer division
    
    System.out.println("Num of minutes: " + numMinutes);
    
    int remainSeconds = (int) (numSeconds % 60); //since the values are diff, you cannot go from big to small. so you can force it but putting int(explicit conversion)
    
    System.out.println("Remainding seconds: " + remainSeconds);
    
    
    
  }
}


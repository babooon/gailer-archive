import java.io.*;
import java.util.Scanner;

class TestGroupsSentinel
{
  public static void main ( String[] args ) throws IOException
  {
    int value;     // the value of the current integer
    
    // Prompt for and open the input file   
    Scanner user = new Scanner( System.in );
    System.out.print("File name? ");
    String fileName = user.next().trim();
    Scanner scan = new Scanner( new File(fileName) );  

    // Group "A"
    int sumA = 0;      // the sum of scores for group "A"
    int countA = 0; // initialize the group A count
    
    while ( (value = scan.nextInt()) != -1 )
    {
      sumA   = sumA + value ; // add to the sum
      countA = countA + 1;    // increment the count
    }

    if ( countA > 0 )
      System.out.println( "Group A average: " + ((double) sumA)/countA ); 
    else
      System.out.println( "Group A  has no students" );
  
    // Group "B" 
    int sumB = 0;   // the sum of scores for group "B"
    int countB = 0;      // initialize count

    while ( (value = scan.nextInt()) != -1 )
    {
      sumB   = sumB + value ; // add to the sum
      countB = countB + 1;    // increment the count
    }

    if ( countB > 0 )
      System.out.println( "Group B average: " + ((double) sumB)/countB ); 
    else
      System.out.println( "Group B  has no students" );
  }
}
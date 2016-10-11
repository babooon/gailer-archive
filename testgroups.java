import java.io.*;
import java.util.Scanner;

class TestGroups
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
    //
    int sizeA;     // the number of students in group "A"
    int sumA = 0;   // the sum of scores for group "A"

    sizeA  = scan.nextInt();
    int count = 0; // initialize count

    while ( count < sizeA )
    {
      value = scan.nextInt();
      sumA  = sumA + value ; // add to the sum
      count = count + 1; // increment the count
    }

    if ( sizeA > 0 )
      System.out.println( "Group A average: " + ((double) sumA)/sizeA ); 
    else
      System.out.println( "Group A  has no students" );
  
    // Group "B" 
    //
    int sizeB;     // the number of students in group "B"
    int sumB = 0;   // the sum of scores for group "B"

    sizeB  = scan.nextInt();
    count = 0;      // initialize count

    while ( count < sizeB )
    {
      value = scan.nextInt();
      sumB  = sumB + value ; // add to the sum
      count = count + 1; // increment the count
    }

    if ( sizeB > 0 )
      System.out.println( "Group B average: " + ((double) sumB)/sizeB ); 
    else
      System.out.println( "Group B  has no students" );
  
  }
}
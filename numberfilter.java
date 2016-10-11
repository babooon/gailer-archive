import java.util.Scanner;
import java.io.*;

class numberfilter
{
  public static void main (String[] args) throws IOException
  { 
    int num;
	
    // Scanner for user input
    Scanner user = new Scanner( System.in ); 
    String  inputFileName, outputFileNameE, outputFileNameU;

    // prepare the input file
    System.out.print("Input File Name: ");
    inputFileName = user.nextLine().trim();
    File input = new File( inputFileName );      
    Scanner scan = new Scanner( input );      

    // prepare the output file
    System.out.print("Output File Name Even: ");
    outputFileNameE = user.nextLine().trim();
    File outputE = new File( outputFileNameE );      
    PrintStream  printE = new PrintStream( outputE );   

    // prepare the output file 2
    System.out.print("Output File Uneven: ");
    outputFileNameU = user.nextLine().trim();
    File outputU = new File( outputFileNameU );      
    PrintStream  printU = new PrintStream( outputU );	

    // processing loop
    while( scan.hasNextInt() )    
    {
      num = scan.nextInt();
	  if (num >= 0){printE.print(num + " ");}
	  if (num < 0){printU.print(num + " ");}
    }
	
    printE.close();
	printU.close();
	
  }
}
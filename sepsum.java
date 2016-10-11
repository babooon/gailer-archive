import java.util.Scanner;
import java.io.*;

class sepsum
{
  public static void main (String[] args) throws IOException
  { 
    int num, sumx=0, sumy=0;
	
    // Scanner for user input
    Scanner user = new Scanner( System.in ); 
    String  inputFileName, outputFileName;

    // prepare the input file
    System.out.print("Input File Name: ");
    inputFileName = user.nextLine().trim();
    File input = new File( inputFileName );      
    Scanner scan = new Scanner( input );      

    // prepare the output file
    System.out.print("Output File Name: ");
    outputFileName = user.nextLine().trim();
    File output = new File( outputFileName );      
    PrintStream  print = new PrintStream( output );   


    // processing loop
    while(scan.hasNext()){
		if (scan.next().equals("x=")){
			System.out.println("ja, x eh");
			num = scan.nextInt();
			sumx += num;
		}
		else{
			System.out.println("ja, y eh");
			num = scan.nextInt();
			sumy += num;
		}		
    }
	
	System.out.println("Summe x:" + sumx);
	System.out.println("Summe y:" + sumy);	
	print.println("Summe x:" + sumx);
	print.println("Summe y:" + sumy);	
    print.close();
	
  }
}
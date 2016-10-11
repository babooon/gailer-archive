import java.util.Scanner;
import java.io.*;

class IOsum
{
  public static void main (String[] args) throws IOException
  { 
    float num, sum=0;    
	float sumSQ=0;
	float avg, avgSQ, var, sd;
	int N = 0;
	
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
    while( scan.hasNextFloat() )    
    {
      num = scan.nextFloat();
	  sum += num;
	  sumSQ += (float)Math.pow(num, 2);
	  N++;
    }
	
	if (N==0){print.println("No values there, motherfucker!");}
	else{
		avg = sum/N;
		avgSQ = sumSQ/N;
		var = avgSQ - (float)Math.pow(avg, 2);
		sd = (float)Math.pow(var, 0.5);
	
	
		print.println("Summe sum: " + sum);
		print.println("Quadratsumme sumSQ: " + sumSQ);
		print.println("Mittelwert: avg" + avg);
		print.println("Mittelwertquadrat avgSQ: " + avgSQ);
		print.println("Varianz var: " + var);
		print.println("Standardabweichung sd: " + sd);
	
    // close the output file
    print.close();
	}
  }
}
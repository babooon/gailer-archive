import java.util.Scanner;
import java.io.*;

class wordremover
{
  public static void main (String[] args) throws IOException
  { 
    String line;
	String token;
	int tokenlength=0, linelength=0;
	
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
    while (scan.hasNext()){
		line = scan.nextLine();
		Scanner linescan = new Scanner(line);
		linelength = line.length();
		tokenlength = 0;
		while (linescan.hasNext()){
			token = linescan.next();
			tokenlength += token.length();
			if (tokenlength > linelength){
				print.println("");
			}
			if (!token.equals("the") && !token.equals("a")){
				print.print(token + " ");
			}
		}
    }
	print.close();
  }
}
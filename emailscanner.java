import java.util.Scanner;
import java.io.*;

class emailscanner
{
  public static void main (String[] args) throws IOException
  { 
	String token;
	int length, i, chnum, chnum2;
	
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

	while(scan.hasNext()){
	
		token = scan.next();
		length = token.length();
		chnum = token.indexOf('@');
		chnum2 = token.indexOf('.');
		
		if (chnum != -1){ //&& !(token.charAt(chnum-1) == ' ') && !(token.charAt(chnum+1) == ' ') && chnum2 > chnum+1){
			for (i=0; i < length; i++){
				print.print(token.charAt(i));
			}
			print.println("");
		}
	}
	print.close();
  }
}
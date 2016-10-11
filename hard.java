import java.io.*;
import java.util.*;

class hard
{
  public static void main ( String[] args ) throws IOException {
	String inputFileName;
  
    // Scanner for user input
    Scanner user = new Scanner( System.in ); 
	
    // prepare the input file
    System.out.print("Input File Name: ");
    inputFileName = user.nextLine().trim();
    File input = new File( inputFileName );      
    Scanner scan = new Scanner( input );

	int value;
	int sum[] = new int[10];
	int i = 0, x;
	
    while (scan.hasNext()){
		
		if (scan.next().equals("next")){
			while (scan.hasNextInt()){
				value = scan.nextInt();
				sum[i] = sum[i] + value;
			}
			i++;		
		}
		else {System.out.println("your data sucks");}
    }
	for (x = 0; x < i; x++){
		System.out.println( "sum" + x + ": " + sum[x]);
	}
  }
}
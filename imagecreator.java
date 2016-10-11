import java.io.* ;
import java.lang.*;

class ImageCreator
{

	public static void main ( String[] args ) throws FileNotFoundException{
		
		File output = new File( "imgcreator.txt" );      
		PrintStream  print = new PrintStream( output );
		
		for (int i=0; i < 8*64; i++)
			print.println("0");
			
		for (int i=0; i < 8*64; i++)
			print.println("1");
		
		for (int i=0; i < 8*64; i++)
			print.println("2");
			
		for (int i=0; i < 8*64; i++)
			print.println("3");
			
		for (int i=0; i < 8*64; i++)
			print.println("4");
			
		for (int i=0; i < 8*64; i++)
			print.println("5");
			
		for (int i=0; i < 8*64; i++)
			print.println("6");
			
		for (int i=0; i < 8*64; i++)
			print.println("7");
			
		print.close();
	}
}
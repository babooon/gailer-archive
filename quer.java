import java.awt.*;
import java.util.*;

class quer
{
  public static void main(String[] args)
  {	
 
	Scanner scan = new Scanner( System.in );
	String str;
	int zeilen, zeilenfest;
	int z = 1;
	int x = 0;
	
	System.out.println("Schreiben Sie etwas!");
	str = scan.nextLine();
	
	zeilen = str.length();
	zeilenfest = zeilen;
	
	
	while (zeilen > 0)
	{
		
		while (z <= zeilenfest)
			{ 
			if (x == zeilenfest)
				{
				x=0;
				}
			System.out.print(str.charAt(zeilenfest-zeilen+x));
			z = z + 1;
			x = x + 1;
			}
		z = 1;
		x = 0;
		System.out.println("");
		zeilen = zeilen - 1;
	}
	
  }
}
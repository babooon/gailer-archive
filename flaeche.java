import java.awt.*;
import java.util.*;

class flaeche
{
  public static void main(String[] args)
  {	
 
	long flaeche;
	
    Point pt1 = new Point( 10, 10 );
    Point pt2 = new Point( 30, 30 );
	
	flaeche = ( Math.abs((int)pt2.getX()) - Math.abs((int)pt1.getX()) ) * ( Math.abs((int)pt2.getY()) - Math.abs((int)pt1.getY()) );

	System.out.println("Die Flaeche betraegt: " + flaeche);

  }
}
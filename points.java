import java.awt.*;
import java.util.*;

class points
{
  public static void main(String[] args)
  {	
 
	long flaeche;
	Point pt1, pt2, ptalias;
	
    pt1 = new Point( 10, 10 );
    pt2 = new Point( 30, 30 );
	
	ptalias = pt1;
	
	if (pt1 == ptalias)
		System.out.println("pt1 und ptalias verweisen auf dasselbe Objekt.");
	
	System.out.println("Point pt1 vorher: \t" + pt1.toString());
	System.out.println("Point ptalias vorher: \t" + ptalias.toString());
	
	ptalias.translate((int)ptalias.getX(),(int)ptalias.getY());
	
	System.out.println("Nur von ptalias wurden die x- und y-Werte geaendert.");
	
	System.out.println("Point pt1 nachher: \t" + pt1.toString());
	System.out.println("Point ptalias nachher: \t" + ptalias.toString());
	

  }
}
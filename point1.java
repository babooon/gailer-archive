import java.awt.*;
import java.util.*;

class point1
{

  public static void main ( String arg[] )
  {
    Point a, b;
	int x1, y1, x2, y2;
	Scanner scan = new Scanner( System.in );
	
	System.out.println("x1:");
	x1 = scan.nextInt();
	
	System.out.println("y1:");
	y1 = scan.nextInt();
	
	System.out.println("x2:");
	x2 = scan.nextInt();
	
	System.out.println("y2:");
	y2 = scan.nextInt();
	
	a = new Point(x1,y1);
	b = new Point(x2,y2);
	
	if (a.equals(b))
		{
		System.out.println("Die Koordinaten der Punkte sind gleich!");
		}
	
	System.out.println("Punkt 1: " + a.toString());
	System.out.println("Punkt 2: " + b.toString());
	
  }
}
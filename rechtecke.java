import java.util.Scanner;

class rechtecke
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner ( System.in );
	
	double x1;
	double y1;
	double x2;
	double y2;
	double breite = 1;
	double hoehe = 1;
	double flaeche;
	
	
    while ((breite != 0.0) && (hoehe != 0.0))
		{
		
		
		System.out.print("X-Koordinate des ersten Eckpunkts: ");
        x1 = scan.nextDouble();
		
		System.out.print("Y-Koordinate des ersten Eckpunkts: ");
        y1 = scan.nextDouble();
		
		System.out.print("X-Koordinate des zweiten Eckpunkts: ");
        x2 = scan.nextDouble();
		
		System.out.print("Y-Koordinate des zweiten Eckpunkts: ");
        y2 = scan.nextDouble();
		
		breite = x2 - x1;
		hoehe = y2 - y1;
		flaeche = breite*hoehe;
		
		System.out.println("Breite: " + breite + "\tHoehe: " + hoehe + "\tFlaeche: " + flaeche );
		System.out.println("");
		}
	System.out.println("bye");
  }

}

import java.util.Scanner;

class kreis
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    int exp = 2;
	int radius;
	double flache;
	
    System.out.println("Geben Sie eine Ganzzahl ein:");
    radius = scan.nextInt();
    flache = (Math.PI)*(Math.pow(radius, exp));

    System.out.println("Der Radius ist: " + radius + " Die Flaeche betraegt: " + flache);
  }
}
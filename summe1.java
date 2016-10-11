import java.util.Scanner;
// Anwender wählt den Anfangs- und Endwert
class summe1
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner( System.in );
    int n;
	final int i = 1;
	int x = 1;
	double summe = 0;
	final double zaehler = 1.0;

    System.out.println( "Geben Sie n ein:" );
    n     = scan.nextInt();


    while ( x <= n )
    {
      summe = summe + 1.0/x;
      x = x + i;
	  
    }
    System.out.println( "Die Summe ist: " + summe);
  }
}
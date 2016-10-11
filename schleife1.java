import java.util.Scanner;
// Anwender wählt den Anfangs- und Endwert
class schleife1
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner( System.in );
    int zaehler, limit;

    System.out.println( "Geben Sie den Anfangswert ein:" );
    zaehler     = scan.nextInt();

    System.out.println( "Geben Sie den Endwert ein:" );
    limit     = scan.nextInt();

    while ( zaehler <= limit )   // kleiner-oder-gleich-Operator
    {
      System.out.println( "Zaehler ist:" + zaehler );
      zaehler = zaehler + 1;
    }
    System.out.println( "Schleife beendet" );
  }
}
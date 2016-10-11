import java.util.Scanner;
class  Quadratwurzel
{
  public static void main( String[] args )
  {
    final double FASTNULL = 1.0E-14 ;
    double n  ;               // der Anwender gibt n ein
    double schaetzung = 1.0 ; // die gleiche Schätzung funktioniert für jedes n

    // die Zahl vom Anwender holen
    Scanner scan = new Scanner( System.in );
    System.out.print("Geben Sie eine Zahl ein: ");
    n = scan.nextDouble();

    if( n >= 0.0 )
    {
      while ( Math.abs( n/(schaetzung*schaetzung) - 1.0 ) > FASTNULL )
      {
         // einen neuen Wert für schaetzung berechnen
         schaetzung =  n/(2*schaetzung) + schaetzung/2 ;
      }

      System.out.println("Die Quadratwurzel von " + n + " ist " + schaetzung ) ;
    }
    else
      System.out.println("Geben Sie bitte eine positive Zahl ein.");

  }
}
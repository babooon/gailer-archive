import java.util.Scanner;

// Anwender gibt einen Wert N ein
// Addieren der geraden, ungeraden und aller Integer von 0 bis N
//
class summe2
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner( System.in );
    int n, summeAlle = 0, summeGerade = 0, summeUngerade = 0;

    System.out.println( "Geben Sie den Grenzwert ein:" );
    n = scan.nextInt();

    int zaehler = 0 ;
    while (  zaehler <= n )
    {
      summeAlle = summeAlle + zaehler ;

      if ( zaehler % 2 == 0  )
        summeGerade = summeGerade + zaehler ;

      else
        summeUngerade  = summeUngerade  + zaehler ;

      zaehler = zaehler + 1 ;
    }

    System.out.print  ( "Summe aller: " + summeAlle  );
    System.out.print  ( "\tSumme der geraden: " + summeGerade );
    System.out.println( "\tSumme der ungeraden: " + summeUngerade  );
  }
}
import java.util.Scanner;
class HarmonischeReihe
{
  double berechneSumme( int anzahl )
  {
    int term = 1 ;
    double summe = 0.0;

    while ( term <= anzahl )
    {
      summe += 1.0/term; // addiere den nächsten Term zur Summe
      term++ ;           // inkrementiere term
    }

    return summe;
  }
}

class HarmonischeReiheTester
{
  public static void main ( String[] args )
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Anzahl Terme? ");
    int anzahl = scan.nextInt();
    HarmonischeReihe reihe = new HarmonischeReihe();

    System.out.println("Summe von " + anzahl + " Terme:" + reihe.berechneSumme( anzahl ) );

  }
}
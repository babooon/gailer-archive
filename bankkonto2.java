class Bankkonto
{
  // Daten-Deklaration
  private String kontonummer;
  private String kontoinhaber;
  private int    kontostand;
  private int    zaehler = 0;

  //Konstruktor
  Bankkonto( String ktoNummer, String ktoInhaber, int start )
  {
    kontonummer  = ktoNummer ;
    kontoinhaber = ktoInhaber ;
    kontostand   = start ;
  }

  // Methoden
  private void inkrementZaehler()
  {
    zaehler = zaehler + 1;
  }

  int aktuellerKontostand()
  {
    return kontostand ;
  }

  void  verarbeiteEinzahlung( int betrag )
  {
    inkrementZaehler();
    kontostand = kontostand + betrag ;
  }

  void verarbeiteAuszahlung( int betrag )
  {
    int gebuehr;

    inkrementZaehler();
    if ( kontostand < 100000 )
      gebuehr = 15;
    else
      gebuehr = 0;

    kontostand =  kontostand - betrag - gebuehr  ;
  }

  void anzeigen()
  {
    System.out.println(  kontonummer + "\t" + kontoinhaber + "\t" +
                         kontostand + "\t" + zaehler );
  }

}

class BankkontoTester
{
  public static void main( String[] args )
  {
    Bankkonto bobsKonto  = new Bankkonto( "999", "Bob", 100 );
    Bankkonto jillsKonto = new Bankkonto( "111", "Jill", 500 );

    bobsKonto.verarbeiteAuszahlung( 50 );
    bobsKonto.verarbeiteEinzahlung( 150 );
    bobsKonto.verarbeiteAuszahlung( 50 );

    jillsKonto.verarbeiteEinzahlung( 500 );
    jillsKonto.verarbeiteAuszahlung( 100 );
    jillsKonto.verarbeiteAuszahlung( 100 );
    jillsKonto.verarbeiteEinzahlung( 100 );

    bobsKonto.anzeigen();
    jillsKonto.anzeigen();
  }
}
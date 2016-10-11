class Bankkonto
{
  // Instanzvariablen
  String kontonummer;
  String kontoinhaber;
  int    kontostand;

  // Konstruktoren
  Bankkonto( String ktoNummer, String ktoInhaber, int start )
  {
    kontonummer  = ktoNummer;
    kontoinhaber = ktoInhaber;
    kontostand   = start;
  }

  // Methoden
  int aktuellerKontostand()
  {
    return kontostand;
  }

  void verarbeiteEinzahlung( int betrag )
  {
    kontostand = kontostand + betrag;
  }

  void verarbeiteAuszahlung( int betrag )
  {
    int gebuehr;
    if ( kontostand < 100000 )
      gebuehr = 15;
    else
      gebuehr = 0;

    kontostand = kontostand - betrag - gebuehr;
  }
  void anzeigen()
  {
    System.out.println( kontonummer + "\t" + kontoinhaber + "\t" + kontostand );
  }

}

class BankkontoTester
{
  public static void main( String[] args )
  {
    Bankkonto konto1 = new Bankkonto( "123", "Bob", 100 );

    System.out.println( konto1.aktuellerKontostand() );
    konto1.verarbeiteEinzahlung( 2000 );
    konto1.verarbeiteAuszahlung( 1500 );
    System.out.println( konto1.aktuellerKontostand() );
	
	Bankkonto konto2 = new Bankkonto("007","James Bond", 50000);
	konto2.anzeigen();
	konto2.verarbeiteEinzahlung(70000);
	konto2.verarbeiteAuszahlung(10000);
	konto2.anzeigen();
	
	int scheck = 30000;
    konto2.verarbeiteAuszahlung( scheck );
    konto1.verarbeiteEinzahlung( scheck );
    konto1.anzeigen();
    konto2.anzeigen();
  }
}
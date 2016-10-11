class Fuhrpark
{
  // Daten
  private Auto stadtwagen;
  private Auto gelaendewagen;

  // Konstruktor
  Fuhrpark( int start1, int end1, double gal1,
            int start2, int end2, double gal2 )
  {
    stadtwagen     = new Auto(start1, end1, gal1);
    gelaendewagen  = new Auto(start2, end2, gal2);
  }

  // Methode
  double berechneMPG()
  {
    double summeMPG;
    summeMPG = stadtwagen.berechneMPG() + gelaendewagen.berechneMPG();
    return summeMPG/2.0;
  }

  void auftanken(int stadtTacho, double stadtGalls, int gelaendeTacho, double gelaendeGalls)
  {
    stadtwagen.auftanken(stadtTacho, stadtGalls);

    gelaendewagen.auftanken(gelaendeTacho, gelaendeGalls);
  }
}

class Auto
{
  // Daten
  int startMeilen;   // Tacho Anfangsstand Meilen
  int endMeilen;     // Tacho Endstand Meilen
  double gallonen;   // verbrauchte Gallonen

  // Konstruktor
  Auto(int startTacho, int endTacho, double galls)
  {
    startMeilen = startTacho;
    endMeilen   = endTacho;
    gallonen    = galls;
  }

  // Methoden
  double berechneMPG()
  {
    return (endMeilen - startMeilen)/gallonen;
  }

  void auftanken(int aktuellerTacho,double getankteGalls)
  {
     startMeilen  =  endMeilen;
     endMeilen    =  aktuellerTacho;
     gallonen     =  getankteGalls;
  }
}

class FuhrparkTester
{
  public static void main (String[] args)
  {
    Fuhrpark meineAutos = new Fuhrpark(1000, 1234, 10, 777, 999, 20);
    System.out.println
      ("durchschnittlicher MPG Fuhrpark = " + meineAutos.berechneMPG() );

    meineAutos.auftanken( 1434, 10, 1099, 10 );
    System.out.println
      ("neuer durchschnittlicher MPG Fuhrpark = " + meineAutos.berechneMPG() );
  }
}
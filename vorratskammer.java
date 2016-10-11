import java.awt.*;
import java.util.*;


class Marmelade
{
  // Instanzvariablen
  private String inhalt;   // Art der Frucht im Glas
  private String datum;   // Datum des Abfüllens
  int menge;       // Menge der Marmelade im Glas


  // Konstruktor
  public Marmelade( String inhalt, String datum, int menge )
  {
    this . inhalt = inhalt;
    this . datum  = datum;
    this . menge  = menge;
  }

  // Methoden
  public boolean istLeer()
  {
    return ( menge == 0 );
  }

  public void ausgeben()
  {
    System.out.println ( inhalt + "   " +  datum + "   " +  menge + " Unzen." );
  }

  public void auftragen ( int unzen)
  {
    if ( !istLeer() )
    {
      if ( unzen <= menge )
      {
        System.out.println("Auftragen von " + unzen + " Unzen "
            + inhalt );
        menge = menge - unzen;
      }
      else
      {
        System.out.println("Auftragen von  " + menge + " Unzen "
            + inhalt );
        menge =  0;
      }
     }
     else
       System.out.println("Keine Marmelade im Glas!");
  }

}

class Vorratskammer
{
  // Instanzvariablen
  private Marmelade  glas1;
  private Marmelade  glas2;
  private Marmelade  glas3;
  private Marmelade  glasAusgewaehlt;

  // Konstruktor
  public Vorratskammer( Marmelade glas1, Marmelade glas2, Marmelade glas3 )
  {
    this . glas1    = glas1;
    this . glas2    = glas2;
    this . glas3    = glas3;
    glasAusgewaehlt = null;
  }
  
    public Vorratskammer( Marmelade glas1, Marmelade glas2)
  {
    this . glas1    = glas1;
    this . glas2    = glas2;
    this . glas3    = null;
    glasAusgewaehlt = null;
  }
  
      public Vorratskammer( Marmelade glas1)
  {
    this . glas1    = glas1;
    this . glas2    = null;
    this . glas3    = null;
    glasAusgewaehlt = null;
  }

  // Methoden
  public void ausgeben()
  {
    if (glas1 != null){System.out.print("1: "); glas1 . ausgeben();}
	if (glas2 != null){System.out.print("2: "); glas2 . ausgeben();}
    if (glas3 != null){System.out.print("3: "); glas3 . ausgeben();}
	System.out.println("");
  }

  // wir setzen voraus, dass der Anwender eine richtige Auswahl trifft, 1, 2, oder 3
  public boolean auswaehlen( int glasNummer )
  {
    if ( glasNummer == 1 && glas1 != null){
      glasAusgewaehlt =  glas1;
	  return true;
	}
    else if ( glasNummer == 2 && glas2 != null ){
      glasAusgewaehlt = glas2;
	  return true;
	}
    else if ( glasNummer == 3 && glas3 != null ){
      glasAusgewaehlt = glas3;
	  return true;
	}
	else
		//System.out.println("Auswahl fehlgeschlagen!")
	  return false;
  }

  // Auftragen der ausgewählten Marmelade
  public void auftragen( int unzen  )
  {
    glasAusgewaehlt . auftragen( unzen  );
  }
  
    public void ersetzen(Marmelade m, int slot){
	if (slot == 1){
	glas1 = m;
	}
	if (slot == 2){
	glas2 = m;
	}
	if (slot == 3){
	glas3 = m;
	}
  }
  
  public void gemischteFruechte(){
	if (glas1.menge >= 2 && glas2.menge >= 2 && glas3.menge >= 2){
		Marmelade gemischt = new Marmelade("Gemischt", "Heute", (glas1.menge + glas2.menge + glas3.menge));
		glas1 = gemischt;
		
		glas2 = null;
		glas3 = null;
	}
  }
}

class VorratskammerTester
{
  public static void main ( String[] args )
  {
	int eingabe_auswahl;
	int eingabe_auftrag;
	boolean running = true;
	
    Marmelade stachelbeer = new Marmelade( "Stachelbeer", "04.07.09", 12 );
    Marmelade erdbeer     = new Marmelade( "Erdbeer", "30.09.10", 8 );
    Marmelade aprikosen   = new Marmelade( "Aprikosen", "31.10.10", 3 );

    Vorratskammer vorrat = new Vorratskammer( stachelbeer, erdbeer, aprikosen );
	
	Scanner scan = new Scanner( System.in );
	System.out.println("");
	System.out.println("Willkommen zu Mutter Hubbards Vorratskammer!");
	System.out.println("");
	vorrat.ausgeben();
    
	while (running){
		
		
		System.out.println("Treffen Sie Ihre Auswahl: 1, 2 oder 3! (Exit = -1)");
		eingabe_auswahl = scan.nextInt();
		
		if (eingabe_auswahl <= 3 && eingabe_auswahl >= 1){
	
			System.out.println("Wie viel Unzen sollen davon auf den Toast?");
			eingabe_auftrag = scan.nextInt();
		
			vorrat.auswaehlen(eingabe_auswahl);
			vorrat.auftragen(eingabe_auftrag);
			System.out.println("");
			vorrat.ausgeben();
		}
		else{
			if (eingabe_auswahl == -1){
				running = false;
				System.out.println("Good Bye!");
			}
			else{ 
				System.out.println("Ungueltige Auswahl!\n");
				vorrat.ausgeben();
			}
		}
	}
  }
}

class VorratskammerTester2
{
  public static void main ( String[] args )
  {
    Marmelade stachelbeer = new Marmelade( "Stachelbeer", "04.07.09", 12 );
    Marmelade erdbeer     = new Marmelade( "Erdbeer", "31.09.10", 8 );

    Vorratskammer vorrat = new Vorratskammer( stachelbeer, erdbeer );
    vorrat.ausgeben();

    if ( vorrat.auswaehlen(1) )
      vorrat.auftragen(2);
    else
      System.out.println("Auswahl nicht verfuegbar");
    vorrat.ausgeben();

    if ( vorrat.auswaehlen(3) )
      vorrat.auftragen(2);
    else
      System.out.println("Auswahl nicht verfuegbar");
    vorrat.ausgeben();

  }
}


class VorratskammerTester3
{
  public static void main ( String[] args )
  {
    Marmelade stachelbeer = new Marmelade( "Stachelbeer", "04.07.09", 12 );
    Marmelade erdbeer     = new Marmelade( "Erdbeer", "31.09.10", 8 );
    Marmelade aprikosen   = new Marmelade( "Aprikosen", "31.10.10", 16 );

    Vorratskammer vorrat  = new Vorratskammer( stachelbeer, erdbeer, aprikosen );
    vorrat.ausgeben();

    Marmelade kirsch      = new Marmelade( "Kirsch", "01.07.09", 11 );

    vorrat.ersetzen( kirsch, 3 );
    vorrat.ausgeben();
	
	vorrat.gemischteFruechte();
    vorrat.ausgeben();
  }
}
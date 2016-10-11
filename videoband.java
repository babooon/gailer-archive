class Videoband
{
  String   titel;        // Titel des Videos
  int      laenge;       // Anzahl der Minuten
  boolean  vorhanden;    // ist das Video vorhanden?

  // Konstruktor
  public Videoband( String ttl ){
    titel = ttl; laenge = 90; vorhanden = true;
  }

  // Konstruktor
  public Videoband( String ttl, int len ){
    titel = ttl; laenge = len; vorhanden = true;
  }

  public void anzeigen(){
    System.out.println( titel + ", " + laenge + " Min, verfuegbar: " + vorhanden );
  }

}

class Musikvideo extends Videoband
{
  String kuenstler;
  String kategorie;

  public Musikvideo( String ttl, int len, String kuenstler, String kategorie){
	super(ttl, len);
	this.kuenstler = kuenstler;
	this.kategorie = kategorie;
  }
  
  public void anzeigen(){
	super.anzeigen();
	System.out.println( "Kuenstler: " + kuenstler + " Kategorie: " + kategorie );
  }
}

class Spielfilm extends Videoband
{
  String  regisseur;     // Name des Regisseurs
  String  bewertung;     // G, PG, R, oder X

  // Konstruktor
  public Spielfilm( String ttl, int len, String reg, String bew ){
    super( ttl, len ); // den Konstruktor der Superklasse verwenden
    regisseur = reg;   // initialisieren, was in Spielfilm neu ist
    bewertung = bew;
  }
  
  public void anzeigen(){
	super.anzeigen();
	System.out.println( "Regisseur: " + regisseur + "  " + bewertung );
  }

}

class VideoVerleih
{
  public static void main ( String args[] ){
    Videoband   artikelA = new Videoband("Microcosmos", 90 );
    Spielfilm   artikelB = new Spielfilm("Jaws", 120, "Spielberg", "PG" );
	Musikvideo  artikelC = new Musikvideo("Hurpa", 5, "TheMonkey", "HipHop");
    artikelA.anzeigen();
    artikelB.anzeigen();
	artikelC.anzeigen();
  }
}
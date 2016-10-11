import java.util.Scanner;

abstract class Karte
{
  String empfaenger;
  String anrede;
  
  Karte(String empfaenger, String geschlecht){
	this.empfaenger = empfaenger;
	
	if (geschlecht.equals("m"))
		anrede = "Lieber ";
	else
		anrede = "Liebe ";
  }
  
  public abstract void gruss();
}

class Feiertag extends Karte
{
  public Feiertag( String empfaenger, String geschlecht )
  {
	super(empfaenger, geschlecht);
    //empfaenger = e;
  }

  public void gruss()
  {
    System.out.println(anrede + empfaenger + ",\n");
    System.out.println("frohe Feiertage!\n\n");
  }
}

class Geburtstag extends Karte
{
  int alter;

  public Geburtstag ( String empfaenger, int jahre, String geschlecht )
  {
    super(empfaenger, geschlecht);
    alter = jahre;
  }

  public void gruss()
  {
    System.out.println(anrede + empfaenger + ",\n");
    System.out.println("alles Gute zum " + alter + ". Geburtstag.\n\n");
  }
}

class Valentin extends Karte
{
  int kuesse;

  public Valentin ( String empfaenger, int k, String geschlecht )
  {
    super(empfaenger, geschlecht);
    kuesse     = k;
  }

  public void gruss()
  {
    System.out.println(anrede + empfaenger + ",\n");
    System.out.println("herzliche Gruesse und Kuesse,\n");
    for ( int j = 0; j < kuesse; j++ )
      System.out.print("X");
    System.out.println("\n\n");
  }
}

class KarteTester
{
  public static void main ( String[] args )
  {
    String name;
	int alter;
	String geschlecht;
	
    Scanner scan = new Scanner( System.in );

    System.out.println("Ihr Name:");
    name = scan.nextLine();
	
	System.out.println("Ihr Geschlecht: w/m?");
    geschlecht = scan.nextLine();
	
	System.out.println("Ihr Alter: ");
    alter = scan.nextInt();
	
	System.out.println("");

    Feiertag   feiern = new Feiertag( name, geschlecht );
    feiern.gruss();

    Geburtstag  geb  = new Geburtstag( name, alter, geschlecht );
    geb.gruss();

    Valentin val = new Valentin( name, 7, geschlecht);
    val.gruss();

  }
}
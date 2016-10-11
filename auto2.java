import java.util.Scanner;

class Auto
{
  // Instanzvariablen
  double startTacho;   // Anfangsstand Tachometer
  double aktacho;
  double gallonen;
  
  // Konstruktor
  Auto(double startMeilen)
  {
    startMeilen = startTacho;
  }

  // Methoden
  double berechneMPG()
  {
    return (aktacho-startTacho) / gallonen ;
  }
  
  boolean benzinschwein()
  {
	if ( ((aktacho-startTacho)/gallonen) < 15.0 )
		{return true;}
	else
		{return false;}
  }
  
  boolean sparauto()
   {
	if ( ((aktacho-startTacho)/gallonen) > 30.0 )
		{return true;}
	else
		{return false;}
   }
   
  void auftanken(double akt, double gal)
	{
	aktacho = akt;
	gallonen = gal;
	startTacho = (aktacho-startTacho);
	}
}

class tankstelle
{
  public static void main( String[] args )
  {
	double aktacho;   // Anfangsstand Tachometer
	double gallonen;      // verbrauchte Gallonen Benzin
	
	Scanner scan = new Scanner( System.in );
	String autotyp = new String("");
	Auto auto = new Auto(0.0);
	String yesnostr;
	boolean yes = false;
	
	while (yes == false)
	{
	System.out.println("Aktueller Tachostand? ");
	aktacho = scan.nextDouble();
	
	System.out.println("Wieviele Gallonen? ");
	gallonen = scan.nextDouble();
	
	auto.auftanken(aktacho, gallonen);
	
	if (auto.benzinschwein() == true)
		autotyp = "Benzinschwein!";
		
	if (auto.sparauto() == true)
		autotyp = "Sparauto!";
		
	System.out.println( "Meilen pro Gallonen: " + auto.berechneMPG() + " Autotyp: " + autotyp);
	System.out.println("Programm beenden? j/n");
	
	yesnostr = scan.nextLine();
	
	System.out.println("");
	System.out.println("");
	
	if (yesnostr.equals("j"))
		yes = true;
	}
	System.out.println("Bye!");
  }
}
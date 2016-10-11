import java.util.Scanner;

class Auto
{
  // Instanzvariablen
  double startMeilen;   // Anfangsstand Tachometer
  double endMeilen;     // Endstand Tachometer
  double gallonen;      // verbrauchte Gallonen Benzin

  // Konstruktor
  Auto(  double startTacho, double endTacho, double galls  )
  {
    startMeilen = startTacho;
    endMeilen   = endTacho;
    gallonen    = galls;
  }

  // Methoden
  double berechneMPG()
  {
    return (endMeilen - startMeilen) / gallonen ;
  }
  
  boolean benzinschwein()
  {
	if ( ((endMeilen-startMeilen)/gallonen) < 15.0 )
		{return true;}
	else
		{return false;}
  }
  
  boolean sparauto()
   {
	if ( ((endMeilen-startMeilen)/gallonen) > 30.0 )
		{return true;}
	else
		{return false;}
   }
}

class automeilen
{
  public static void main( String[] args )
  {
	Scanner scan = new Scanner( System.in );
	double startMeilen;   // Anfangsstand Tachometer
	double endMeilen;     // Endstand Tachometer
	double gallonen;      // verbrauchte Gallonen Benzin
	
	System.out.println("Anfangsmeilenstand? ");
	startMeilen = scan.nextDouble();
	
	System.out.println("Endmeilenstand? ");
	endMeilen = scan.nextDouble();
	
	System.out.println("Verbrauchte Gallonen? ");
	gallonen = scan.nextDouble();
	System.out.println("");
	
    Auto auto = new Auto(startMeilen,endMeilen,gallonen);
    System.out.println( "Meilen pro Gallonen: " + auto.berechneMPG() );
	
	if (auto.benzinschwein() == true)
		System.out.println("Benzinschwein!");
		
	if (auto.sparauto() == true)
		System.out.println("Sparauto!");
  }
}
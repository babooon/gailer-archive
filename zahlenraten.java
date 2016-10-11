import java.util.*;

class zahlenraten
{
  public static void main ( String[] args )
  {
    int versuch = 1;
    Scanner scan = new Scanner( System.in );
    Random rand = new Random();
	int zahl, tip;

	System.out.println("Ich denke an eine Zahl von 1 bis 10.");
	System.out.println("Sie haben 3 Versuche, sie zu erraten!");
	System.out.println("Raten Sie!");
	
	zahl = rand.nextInt(10)+1;
	
    while ( versuch <= 3 )
    {
		System.out.println("Versuch: " + versuch);
		tip = scan.nextInt();
		
		if (tip == zahl)
		{
			System.out.println("Richtig!");
			versuch = 5; //5 = ende
		}
		else
		{
			versuch = versuch +1;
			System.out.println("Falsch!");
		}
	
	
	}
	if (versuch == 5) 
		System.out.println("Sie haben das Spiel gewonnen!");
	else
		System.out.println("Verloren! Die richtige Zahl war " + zahl + ".");
  }
}
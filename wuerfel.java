import java.util.*;

class wuerfel
{
  public static void main ( String[] args )
  {
    // Deklarieren und Initialisieren
    final int ENDSTAND = 10;
    Scanner scan = new Scanner( System.in );
    Random rand = new Random();
    int spielerscore = 0, computerscore = 0;
    int spielerwurf, computerwurf;

    // Runden spielen, bis einer der Spieler den ENDSTAND erreicht hat
    while ( spielerscore < ENDSTAND && computerscore < ENDSTAND )
    {
      // Computer wirft
      computerwurf = rand.nextInt(6)+1 + rand.nextInt(6)+1 ;
      System.out.println("Der Computer wirft: " + computerwurf);

      // Spieler wirft
      System.out.print("1 -> 11-seitiger Wuerfel | 2 -> 6-seitiger Wuerfel (1 oder 2)? ");
      String wuerfeltyp = scan.nextLine();

      if ( wuerfeltyp.equals("1") )
      {
        spielerwurf = rand.nextInt(11)+2 ;
        System.out.println("Sie werfen 1 Wuerfel und haben: " + spielerwurf );
      }
      else
      {
        spielerwurf = rand.nextInt(6)+1 + rand.nextInt(6)+1 ;
        System.out.println("Sie werfen 2 Wuerfel und haben: " + spielerwurf );
      }

      // Gewinner der Runde bestimmen und den Score anpassen
	  
	  if (spielerwurf == computerwurf)
		System.out.println("Unentschieden, noch einmal wuerfeln!");
	  else
	  {
		if ( spielerwurf > computerwurf )
		{
			spielerscore = spielerscore + 1;
			System.out.println("Sie haben die Runde gewonnen!");
		}
		else
		{
			computerscore = computerscore + 1;
			System.out.println("Sie haben die Runde verloren!");
		}
		
	  }
    System.out.println("Score: Computer " + computerscore + ", Sie " + spielerscore + "\n");
    }

    // Gewinner des Spiels bestimmen
    System.out.println("Endstand: Computer " + computerscore + ", Sie " + spielerscore);

    if ( computerscore > spielerscore )
      System.out.println("Der Computer hat das Spiel gewonnen!");
    else
      System.out.println("Sie haben das Spiel gewonnen!");

  }
}
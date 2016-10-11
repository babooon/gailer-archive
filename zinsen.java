import java.util.Scanner;

class  zinsen
{

  public static void main( String[] args )
  {
    double anfangsbetrag = 1000.0 ;
    double dollars       = 0.0;
    double zinssatz ;
    int    jahre ;
	int jahrgrenze;
	Scanner scan = new Scanner( System.in );
	
	System.out.println( "In wieviel Jahren wollen Sie eine Million haben?" );
	jahrgrenze = scan.nextInt();

    zinssatz = -0.001 ;   // das wird gleich auf 0 erhöht

    while ( dollars < 1000000 )
    {
       // zum nächsten Zinssatz wechseln
       zinssatz = zinssatz + 0.001;

       // Dollars nach 40 Jahren beim gegenwärtigen Zinssatz berechnen
       jahre   =  1 ;
       dollars = anfangsbetrag ;
       while (  jahre <= jahrgrenze )
       {
         dollars = dollars + dollars*zinssatz ; // Zinsen für ein weiteres
                                                // Jahr addieren
         dollars = dollars + 1000 ;             // fügen Sie die jährliche
                                                // Einzahlung hinzu
         jahre    =  jahre + 1 ;
       }
	System.out.println("Nach" + (jahre-1) + "Jahren bei " + zinssatz*100
	+ "Prozent Zinsen werden Sie " + dollars + " Dollar haben." ) ;
	System.out.println("");
    }

    System.out.println("Nach " + jahrgrenze + " Jahren bei " + zinssatz*100
      + "Prozent Zinsen werden Sie " + dollars + " Dollar haben." ) ;
  }

}
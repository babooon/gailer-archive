import java.util.Scanner;

class  zinsen2
{

  public static void main( String[] args )
  {
    double zinssatz;
    double gesamtschuld;
	double monatszahlung;
    int    monat = 1;
	double kontostand = 1.0; //auch Saldo genannt
	
	Scanner scan = new Scanner( System.in );
	
	System.out.println( "Gesamtschuld: " );
	gesamtschuld = scan.nextDouble();

	System.out.println( "Zinssatz: " );
	zinssatz = scan.nextDouble();
	
	System.out.println( "Monatliche Rate: " );
	monatszahlung = scan.nextDouble();
	
	kontostand = gesamtschuld;
	while (kontostand>0)
		{
		kontostand = kontostand*(1+(zinssatz/100)) - monatszahlung;
		System.out.println( "Monat: " + monat + "\tSaldo: " + kontostand 
		+ "\tGesamte Einzahlung: " + monat*monatszahlung);
		monat = monat + 1;
		}
	System.out.println("");
	System.out.println( "Monat: " + monat + "\tSaldo: " + (kontostand - kontostand)
	+ "\t\t\tGesamte Einzahlung: " + (kontostand + monat*monatszahlung));
	System.out.println("");
	System.out.println("Die Bank zahlte Ihnen im " + monat + ". Monat " + (-kontostand) + " zurueck.");
	System.out.println("Sie sind nun schuldenfrei!");
	}
}

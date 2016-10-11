import java.util.Scanner;

class versand
{
  public static void main (String[] args)
  {
	String item = new String("Schoki");
	double pschoki = 2.99;
	int anzahl;
	double gesamt;
	double versand;
	double expversand;
	String artikel;
	int express;
    Scanner scan = new Scanner( System.in );
	
	
	System.out.println("Artikel? Schoki vllt?");
	artikel = new String(scan.nextLine());
	
	System.out.println("Wie viele");
	anzahl = scan.nextInt();
	
	System.out.println("Expressversand? 1 fuer ja");
	express = scan.nextInt();
	
	if (express == 1)
		{expversand = 5.0;}
	else
		{expversand = 0.0;}
		
	if (pschoki*anzahl > 10.0)
		{versand = 3+expversand;}
	else
		{versand = 2+expversand;}
	
	if (artikel.equals(item))
	{
		System.out.println(artikel + ": " + pschoki + " x " + anzahl );
		System.out.println("Versand: " + versand);
		System.out.println("Gesamt: " + (versand+(pschoki*anzahl)) );
	}
	else
	System.out.println("Et jibt nur Schoki");
	
	System.out.println("debug:" + artikel + item);
	
	
	
	
	
	}
	
  }

import java.util.Scanner;

class versand2
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner ( System.in );
	
	double gewicht = 1.0;
	double aufpreis = 0.25;
	double preis = 3.0;
	
	
	
    while (gewicht > 0.0)
		{
		preis = 3.0;
		
		System.out.print("Gewicht der Sendung: ");
        gewicht = scan.nextDouble();
		
		
		if (gewicht > 10.0)
			preis = preis + (gewicht-10.0)*aufpreis;
			else
			preis = preis;
			
		System.out.println("Versandkosten: " + preis + "$");
		}
	System.out.println("bye");
  }

}

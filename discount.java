import java.util.Scanner;

class discount
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
	int betrag;
    System.out.println("Geben Sie den Gesamtbetrag in Cent ein:");
    betrag = scan.nextInt();

	if(betrag < 10)
	{
	System.out.println("Discountpreis: " + betrag);
	}
	else
	{
	System.out.println("Discountpreis: " + (betrag - betrag/10));
	}
	
  }
}
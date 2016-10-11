import java.util.Scanner;

class dc
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
   
	int betrag;
	int dollar;
	int cent;
	
	
    System.out.println("Geben Sie einen Betrag in Cent ein:");
    betrag = scan.nextInt();
    dollar = (betrag/100);
	cent = (betrag%100);

    System.out.println("Das ergibt " + dollar + " Dollar und " + cent + " Cent.");
  }
}
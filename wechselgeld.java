import java.util.Scanner;

class wechselgeld
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
   
	int betrag;
	int dollar;
	int quarter;
	int dime;
	int nickel;
	int cent;
	
	
    System.out.println("Geben Sie das Wechselgeld in Cent ein:");
    betrag = scan.nextInt();
    dollar = (betrag/100);
	quarter = ((betrag%100)/25);
	dime = (((betrag%100) - quarter*25)/10);
	nickel = (((betrag%100) - quarter*25 - dime*10)/5);
	cent = (((betrag%100) - quarter*25 - dime*10 - nickel*5));
	
    System.out.println("Wechselgeld: " + betrag + " betrag " + dollar + " dollar " + quarter + " quarter " + dime + " dime " + nickel + " nickel " + cent + " cent ");
  }
}
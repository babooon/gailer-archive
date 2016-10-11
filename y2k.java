import java.util.Scanner;

class y2k
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );

	int gjahr;
	int alter;
	int jahr;
	
    System.out.println("Geburtsjahr :");
    gjahr = scan.nextInt();
	
	System.out.println("Aktuelles Jahr:");
    jahr = scan.nextInt();
	
	
	if (jahr < gjahr)
	{System.out.println("Gesamtpreis: " + (100-gjahr+jahr));}
	else
	{System.out.println("Gesamtpreis: " + (jahr-gjahr));}
	
	
	
	}
	
  }

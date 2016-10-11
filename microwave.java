import java.util.Scanner;

class mcw
{
  public static void main (String[] args)
  {
  
    Scanner scan = new Scanner( System.in );
	int hitzzeit;
	int postenanz;
	
	System.out.println("Erhitzungszeit fuer 1 Posten in s? ");
	hitzzeit = scan.nextInt();
	
	System.out.println("Anzahl der Posten? ");
	postenanz = scan.nextInt();
	
	if (postenanz == 1)
	System.out.println("Empfohlene Erhitzungszeit: " + hitzzeit*1.0);
	if (postenanz == 2)
	System.out.println("Empfohlene Erhitzungszeit: " + hitzzeit*1.5);
	if (postenanz == 3)
	System.out.println("Empfohlene Erhitzungszeit: " + hitzzeit*2.0);
	if (postenanz > 3)
	System.out.println("Nisch das janze Ding vollknallen! 1-3 Junge!");
	if (postenanz < 1)
	System.out.println("Nich mal ein Ganzes... 1-3 Junge!");
	
	}
	
  }

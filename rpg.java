import java.util.Scanner;

class rpg
{
  public static void main (String[] args)
  {
  
    Scanner scan = new Scanner( System.in );
	String charname;
	int staerke;
	int gesundheit;
	int glueck;
	
	System.out.println("Wie heisst dein Charakter? ");
	charname = new String(scan.nextLine());
	
	System.out.println("Staerke? 1-10! ");
	staerke = scan.nextInt();
	
	System.out.println("Gesundheit? 1-10! ");
	gesundheit = scan.nextInt();
	
	System.out.println("Glueck? 1-10! ");
	glueck = scan.nextInt();
	
	if (staerke + gesundheit + glueck > 15)
	System.out.println("Sie haben " + charname + " mehr als 15 Punkte gegeben. Alles wurde auf 5 gesetzt!");
	else
	System.out.println("Allet okeh, viel Spass!");
	
	
	}
	
  }

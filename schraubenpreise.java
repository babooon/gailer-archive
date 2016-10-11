import java.util.Scanner;

class schraub
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
	
	final int sp = 5;
	final int mp = 3;
	final int up = 1;
	
	int as;
	int am;
	int au;
	
    System.out.println("Anzahl der Schrauben:");
    as = scan.nextInt();
	
	System.out.println("Anzahl der Muttern:");
    am = scan.nextInt();
	
	System.out.println("Anzahl der Unterlegscheiben:");
    au = scan.nextInt();
	
	if (as != am)
		System.out.println("Kontrollieren Sie Ihre Bestellung!");
	else
		{}
	System.out.println("Gesamtpreis: " + (as*sp+am*mp+au*up));
	
	
	
	}
	
  }

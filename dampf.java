import java.util.Scanner;

class dampf
{
  public static void main (String[] args)
  {
  
    Scanner scan = new Scanner( System.in );
	double effizienz;
	double tluft;
	double tdampf;
	
	System.out.println("Geben Sie die Lufttemperatur in Kelvin ein: ");
	tluft = scan.nextDouble();
	
	System.out.println("Geben Sie die Dampftemperatur in Kelvin ein: ");
	tdampf = scan.nextDouble();
	
	if (tdampf < 373)
	System.out.println("Der Dampf ist noch Wasser, Horst!");
	else 
	{
	System.out.println("Die Effizienz betraegt: " + (1.0 - tluft/tdampf));
	}
	
	
	}
	
  }

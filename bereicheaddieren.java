import java.util.Scanner;

class bereicheaddieren
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner ( System.in );
	
	int obergrenze;
	int untergrenze;
	int input = 1;
	int summeinnen = 0;
	int summeaussen = 0;
	
	
	System.out.println("")  ;
	System.out.println("Bereiche addieren");
	System.out.print("Untergrenze des Bereichs: ");
        untergrenze = scan.nextInt();
	System.out.print("Obergrenze des Bereichs: ");
        obergrenze = scan.nextInt();
    while (input != 0)
		{
		System.out.println("Daten eingeben: ")  ;
        input = scan.nextInt();
		
		if (input < untergrenze || input > obergrenze)
			summeaussen = summeaussen + input;
			else
			summeinnen = summeinnen + input;
		}

		System.out.println("Summe innerhalb des Bereichs: " + summeinnen);
    System.out.println("Summe ausserhalb des Bereichs: " + summeaussen);
  }

}

import java.util.Scanner;

class gallonen
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner ( System.in );
	
	double ameilen = 0;
	double endmeilen = 0;
	double gallonen = 0;
	String antwort = new String("j");
	
	System.out.println("")  ;
	System.out.println("Programm Meilen pro Gallone");
	System.out.println("")  ;
    while (antwort.equals("j"))
		{
		System.out.print("Anfangsstand Meilen: ");
        ameilen = scan.nextDouble();
		
		System.out.print("Endstand Meilen: ")  ;
        endmeilen = scan.nextDouble();

		System.out.print("Gallonen: ")  ;
        gallonen = scan.nextDouble();
		System.out.println("")  ;
		
		System.out.println("Meilen pro Gallone: " + ((endmeilen-ameilen)/gallonen))  ;
		System.out.println("")  ;
		
		System.out.print("Weitermachen? j/n? ")  ;
        antwort = scan.next();
		System.out.println("")  ;
		
		
		}
	
	System.out.println("bye!")  ;
    
  }

}

import java.util.Scanner;

class potenz
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner( System.in );
    int zaehler = 1;
	int n;
	double x;
	double quad = 1.0;

    System.out.println( "x hoch n. Geben Sie x ein: " );
    x = scan.nextDouble();
	
	System.out.println( "Geben Sie n ein: " );
    n = scan.nextInt();
	if (n>=1)
	{
		while ( zaehler <= n )
		{
		quad=quad*x;
		zaehler = zaehler + 1;
		
		}
	
	System.out.println(x+" hoch "+n+" ergibt: "+quad);
	}
	else
	{
	System.out.println( "n muss ein ositiver Interger sein." );
	}
		
      
    
  }
}
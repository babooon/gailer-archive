import java.util.Scanner;

// Der Anwender gibt Integer N ein.
// Das Programm berechnet N Fakultät.
class quadsum
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner( System.in );
    int zaehler = 1;
	//int quad = 0;
	//int cub = 0;
	int quadsum = 0;
	int cubsum = 0;
	int n;

    System.out.println( "Geben Sie n ein:" );
    n = scan.nextInt();
	
      while ( zaehler <= n )
      {
      
        //quad = zaehler*zaehler;
		//cub = zaehler*zaehler*zaehler;
		
		quadsum = quadsum + zaehler*zaehler;
		cubsum = cubsum + zaehler*zaehler*zaehler;
		zaehler = zaehler + 1;
		
		
      }
      System.out.println( "quadsum: " + quadsum );
	  System.out.println( "cubicsum: " + cubsum );
    
  }
}
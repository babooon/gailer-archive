import java.util.Scanner;

class durch
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner( System.in );
    int n;
	int i = 1;
	double xi;
	double xiq;
	double x = 0.0;
	double xq = 0.0;
	double durchschnitt;
	double durchschnitt2;
	double durchschnittq;
	
	
	System.out.println("Wir berechnen die Standardabweichung von ein paar Werten");
	System.out.println("nach der Formel SD = wurzel(dq - d2) ");
    System.out.println("Wie viele Zahlen folgen? ");
    n     = scan.nextInt();
	while (i <= n)
	{	
	System.out.println("Bitte geben Sie x" + i + " ein! ");
    xi     = scan.nextDouble();
	xiq = xi*xi;
	
	x = x + xi;
	xq = xq + xiq;
	
	i = i + 1;
	}
	
	durchschnitt  = x/n;
	durchschnitt2 = durchschnitt*durchschnitt;
	durchschnittq = xq/n;
	
	System.out.println("\t kontrollrueckgaben");
	
	System.out.println("summe x: "+x);
	System.out.println("summeq xq: "+xq);
	System.out.println("durchschnitt: "+durchschnitt);
	System.out.println("durchschnitt2: "+durchschnitt2);
	System.out.println("durchschnittq: "+durchschnittq);
	
	System.out.println("\t ergebnis");
	
	System.out.println("Die Standardabweichung ist: " +( Math.sqrt(durchschnittq - durchschnitt2)));
  }
}
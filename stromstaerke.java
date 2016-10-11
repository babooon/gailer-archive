import java.util.Scanner;

class stromstaerke
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
   
	double stromstaerke;
	double spannung;
	double widerstand;
	
	
	
    System.out.println("Spannung in V?");
    spannung = scan.nextDouble();
	
	System.out.println("Widerstand in Ohm?");
    widerstand = scan.nextDouble();
    
	stromstaerke = spannung/widerstand;
	
    System.out.println("Die resultierende Stromstaerke betraegt:" + stromstaerke);
  }
}
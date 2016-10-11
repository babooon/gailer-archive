import java.util.*;

class karltest
{
  public static void main(String[] args)
  {	
	Scanner scan = new Scanner( System.in );
	int zahl, index;
	int[] binwert = new int[16]; 
	
	
	System.out.println("16-bit Dezimal in Binaer: ");
	zahl = scan.nextInt();
	
	
	for (index = 0; index <= 15 ;index ++)           // array binwert mit 0en fuellen
		binwert[index] = 0;
	
	for (index = 0;zahl > 0; index ++)				// die einsen
		{
		binwert[index] = zahl%2;
		zahl = zahl/2;
		}
		
	for (index = 15;index >= 0; index --)			// die ausgabe
		System.out.print(binwert[index]);
 }
}
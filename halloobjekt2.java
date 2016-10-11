import java.util.*;


class aaaaaa
{
	// Variablen
	String mitteilung;
	// Konstruktor
	aaaaaa(String mit)
	{
	mitteilung = new String(mit);
	
	}
  // Methodendefinition
  void sprich()
  {
    System.out.println("Hallo " + mitteilung);
  }
  
  
}

class halloobjekt2
{
  public static void main ( String[] args )
  {
	String mitteilung;
	Scanner scan = new Scanner(System.in);
  
	System.out.println("Geben Sie einen Namen ein: ");
	mitteilung = scan.nextLine();
	
    aaaaaa einobjekt = new aaaaaa(mitteilung);
	einobjekt.sprich();
  }
}
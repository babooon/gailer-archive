class halloobjekt
{
	// Konstruktor
  // Methodendefinition
  void sprichM()
  {
    System.out.println("moin!");
  }
  void sprichA()
  {
	System.out.println("naamd!");
  }
  
  
}

class morgenabend
{
  public static void main ( String[] args )
  {
    halloobjekt einobjekt = new halloobjekt();

    einobjekt.sprichA();
  }
}
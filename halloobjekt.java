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
	System.out.println("naamd!")
  }
  
  
}

class hallotester
{
  public static void main ( String[] args )
  {
    halloobjekt einobjekt = new halloobjekt();

    einobjekt.sprichM();
  }
}
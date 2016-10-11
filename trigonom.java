class trigo
{
  public static void main ( String[] args )
  {
    double x = 90*(Math.PI/180);
    double sinx = Math.sin(x);
	double cosx = Math.cos(x);
	int exp = 2;
	double ergebnis = ((Math.pow(sinx, exp)) + (Math.pow(cosx, exp)));
	
	
    System.out.println("Sinus: " + sinx + " Cosinus: " + cosx + " Ergebnis: " + ergebnis );
  }
}
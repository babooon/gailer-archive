class nieder
{
  public static void main ( String[] args )
  {
    byte april = 41;
	byte mai = 87;
	byte juni = 54;
    final double monatsanzahl = 3.0;
	
    System.out.println("Niederschlag im April: \t" + april );
	System.out.println("Niederschlag im Mai: \t" + mai );
	System.out.println("Niederschlag im Juni: \t" + juni );
	System.out.println("Durchschnitt: \t \t" + ((april+mai+juni)/monatsanzahl) );
  }
}
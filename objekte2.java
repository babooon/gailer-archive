class literaltester
{
  public static void main ( String[] args )
  {
    String str1, str2, str3, str4;
	int obj = 4;
	
	
	str1 = "Bo, die Katze!";
	str2 = "Bo, die Katze!";
	
	str3 = new String("Fred, der Hund!");
	str4 = new String("Fred, der Hund!");
	
	if (str1==str2)
		obj = obj - 1;
		
	if (str3==str4)
		obj = obj - 1;
	
	
	System.out.println("Es wurden " + obj + " Objekte erstellt.");
	
  }
}
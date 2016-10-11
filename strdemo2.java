class StringDemo2
{
  public static void main ( String[] args )
  {
    String str;
    int    len;
	
	
    str = new String( "    \t sefsef    ed \t lolo\tlolo lo   jsjsf    " );
	//String str2;
	//str2 = str.trim();
    len = str.length();

	
    System.out.println("Die Laenge ist: " + len );
	System.out.println(str);
	System.out.println(str.trim());
  }
}
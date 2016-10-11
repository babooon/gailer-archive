class Tester
{
  public boolean test( String trial )
  {
    String lower = trial.toLowerCase();

    StringBuffer azBuffer  = new StringBuffer();

    for ( int j=0; j < lower.length(); j++ )
    {
       char c = lower.charAt(j);
       if ( c >= 'a' && c <= 'z' )
         azBuffer.append( c );
    }

    String forward  = azBuffer.toString();
    String backward = azBuffer.reverse().toString();

    if ( forward.equals( backward ) )
      return true;
    else
      return false;
  }
}

class PalindromeTester
{
  public static void main ( String[] args )
  {
    Tester pTester = new Tester();
    String trial = "A man, a plan, a canal, Panama!" ;

    if ( pTester.test( trial ) )
      System.out.println( "Is a Palindrome" );
    else
      System.out.println( "Not a Palindrome" );
  }

}
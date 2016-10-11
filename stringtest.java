class StringTester
{

  public static void main ( String[] args )
  {
    String str;             // str ist eine Variable, die ein Objekt bezeichnet,
                            // aber das Objekt existiert noch nicht.
    int  laenge;            // laenge ist eine primitive Variable vom Typ int

    str = new String("Zufaellige Notizen");  // ein Objekt vom Typ String erzeugen

    laenge  = str.length();  // Aufruf der Methode length() des Objekts str

    System.out.println("Der String ist " + laenge + " Zeichen lang");
  }
}
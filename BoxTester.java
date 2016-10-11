class BoxTester
{

  public static void main ( String[] args )
  {
     Box box = new Box( 2.5, 5.0, 6.0 ) ;

     System.out.println( "Flaeche: "  + box.berechneFlaeche() +
                         " Volumen: " + box.berechneVolumen() );

     System.out.println( "Laenge: " + box.getLaenge() +
                         " Hoehe: " + box.getHoehe() +
                         "Breite: " + box.getBreite() )  ;
  }
}
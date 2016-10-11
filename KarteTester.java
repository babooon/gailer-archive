abstract class Karte
{
  String empfaenger;
  public abstract void gruss();
}

class Feiertag extends Karte
{
  public Feiertag( String e )
  {
    empfaenger = e;
  }

  public void gruss()
  {
    System.out.println("Dear " + empfaenger + ",\n");
    System.out.println("frohe Feiertage!\n\n");
  }
}

public class KarteTester
{
  public static void main ( String[] args )
  {
    Feiertag feiern = new Feiertag("Nikolaus");
    feiern.gruss();
  }
}
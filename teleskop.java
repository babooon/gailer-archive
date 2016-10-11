class Teleskop
{
  // Instanzvariablen
  double durchmesserHauptlinse;
  double brennweiteHauptlinse;
  double brennweiteOkular;

  // Konstruktor
  Teleskop ( double durchmesserHauptlinse, double brennweiteHauptlinse, double brennweiteOkular )
  {
    this.durchmesserHauptlinse          = durchmesserHauptlinse ;
    this.brennweiteHauptlinse = brennweiteHauptlinse ;
    this.brennweiteOkular     = brennweiteOkular ;
  }

  // Methoden
  double berechneVergroesserung()
  {
    return brennweiteHauptlinse / brennweiteOkular ;
  }

  double berechneFZahl()
  {
    return ( brennweiteHauptlinse / durchmesserHauptlinse )  ;
  }
}

class teleskoptest
{
	public static void main(String[] args)
	{
		Teleskop tele = new Teleskop(3,6,1.4);
		System.out.println("F-Zahl: " +tele.berechneFZahl() + "Vergroesserung: " +tele.berechneVergroesserung() );
	}
}
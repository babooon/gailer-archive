import java.awt.*;
import java.util.*;



class Box
{
  // Instanzvariablen
  private double breite;
  private double laenge;
  private double hoehe;


  // Konstruktoren
  Box ( double breite, double laenge, double hoehe )
  {
    this.breite  = breite;
    this.laenge  = laenge;
    this.hoehe   = hoehe;
  }

 Box ( double seite )
  {
    breite  = seite;
    laenge  = seite;
    hoehe   = seite;
  }
  
  Box ( Box alteBox )
  {
	
  }

  // Methoden
  
  
  public boolean passtIn(Box innereBox, Box aeussereBox)
  {
	if (innereBox.getBreite() < aeussereBox.getBreite() && innereBox.getLaenge() < aeussereBox.getLaenge() && innereBox.getHoehe() < aeussereBox.getHoehe())
		return true;
	else
		return false;
  }
  
  public Box kleinereBox()
{
  return new Box(0.75*breite,0.75*laenge,0.75*hoehe);
}

public Box groessereBox()
{
  return new Box(1.25*breite,1.25*laenge,1.25*hoehe);
}
  
  public double berechneVolumen()
  {
    return breite * laenge * hoehe;
  }

  private double berechneFlaecheVorn()
  {
    return laenge*hoehe;
  }
   private double berechneFlaecheOben()
  {
    return laenge*breite;
  }
   private double berechneFlaecheSeitlich()
  {
    return breite*hoehe;
  }
  
  
  public double berechneFlaeche()
  {
    return 2 * berechneFlaecheVorn() +
           2 * berechneFlaecheOben() +
           2 * berechneFlaecheSeitlich() ;
  }

  public double getBreite()
  {
    return breite;
  }
  public double getLaenge()
  {
    return laenge;
  }
  public double getHoehe()
  {
    return hoehe;
  }
}

class boxtester
{

  public static void main ( String[] args )
  {
  
	Scanner scan = new Scanner( System.in );
  
	System.out.println("Breite Box1? ");
	double b1 = scan.nextDouble();
	
	System.out.println("Laenge Box1? ");
	double l1 = scan.nextDouble();
	
	System.out.println("Hoehe Box1? ");
	double h1 = scan.nextDouble();
	
	System.out.println("Breite Box2? ");
	double b2 = scan.nextDouble();
	
	System.out.println("Laenge Box2? ");
	double l2 = scan.nextDouble();
	
	System.out.println("Hoehe Box2? ");
	double h2 = scan.nextDouble();

	-
    Box box = new  Box(b1,l1,h1) ;
	
	Box box2 = new  Box(b2,l2,h2) ;
	
	boolean trfe = box.passtIn(box, box2);
	
	System.out.println( "Laenge: " + box.getLaenge() + " Hoehe: " + box.getHoehe() + "Breite: " + box.getBreite() )  ;
	System.out.println( "Laenge: " + box2.getLaenge() + " Hoehe: " + box2.getHoehe() + "Breite: " + box2.getBreite() )  ;
	System.out.println( "Box1 passt in Box2 = " + trfe); 
	   
  }
}

// class BoxTester
// {

  // public static void main ( String[] args )
  // {
   // Box box = new Box( 2.5, 5.0, 6.0 ) ;

     // System.out.println( "Flaeche: "  + box.berechneFlaeche() + " Volumen: " + box.berechneVolumen() );

     // System.out.println( "Laenge: " + box.getLaenge() + " Hoehe: " + box.getHoehe() + "Breite: " + box.getBreite() )  ;
  // }
// }
abstract class Haustier{

	String name;
	double futtervorrat;
	int    anzahlTage = 0;

	Haustier(String name, double futtervorrat){
		this.futtervorrat = futtervorrat;
		this.name = name;
	}
	
	public void fuettern(){
		sprich();
		while (futtervorrat > 0){
			friss();
			anzahlTage++;
		}
	}

	public void anzeigen(){
		System.out.println("Der Vorrat fuer " + name + " reicht " + anzahlTage + " Tage.");
	}

	public abstract void friss();
	public abstract void sprich();
}

class Katze extends Haustier{
	
	String haltung;
	
	Katze(String name, double futtervorrat, String haltung){
		super(name, futtervorrat);
		this.haltung = haltung;
	}
	
	public void sprich(){
		System.out.println("Miau!");
	}
	
	public void friss(){
			System.out.println(name + ": " + futtervorrat);
			futtervorrat = futtervorrat - 0.5;
	}
	
	public void anzeigen(){
		System.out.print("(Haltung: " + haltung + ") " );
		super.anzeigen();
	}
}

class Hund extends Haustier{
	
	String kategorie;
	
	Hund(String name, double futtervorrat, String kategorie){
		super(name, futtervorrat);
		this.kategorie = kategorie;
	}
	
	public void sprich(){
		System.out.println("Wuff!");
	}
	
	public void friss(){
			System.out.println(name + ": " + futtervorrat);
			futtervorrat = futtervorrat - 1.0;
	}
	
	public void anzeigen(){
		System.out.print("(Kategorie: " + kategorie + ") " );
		super.anzeigen();
	}
}

class pets{

	public static void main ( String[] args ){
		
		Haustier katze = new Katze("Minka", 5.0, "Wohnung");
		Haustier hund = new Hund("Strolchie", 5.0, "Kleinhunde");
		Haustier hund2 = new Hund("Bobby", 8.0, "Grosse Hunde");
		Haustier katze2 = new Katze("Lui", 3.0, "Artgerecht");
		
		System.out.println("");
		katze.fuettern();
		katze.anzeigen();
		
		System.out.println("");
		hund.fuettern();
		hund.anzeigen();
		
		System.out.println("");
		hund2.fuettern();
		hund2.anzeigen();
		
		System.out.println("");
		katze2.fuettern();
		katze2.anzeigen();
	}
}

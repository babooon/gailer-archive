


class Artikel
{
	final double  HANDELSSPANNE = 0.6  ; // 60 Prozent des Einkaufspreises
	final double  MWST          = 0.19 ; // 19 Prozent
	
	int artikelNr;
	String bezeichnung;
	double einkaufspreis; // in Euronen
	int lagerzeit; // in Monaten
	
	
	public Artikel(int artnr, String bez, double ekp, int lgz){
		artikelNr = artnr;
		bezeichnung = bez;
		einkaufspreis = ekp;
		lagerzeit = lgz;
	}
	
	public void anzeigen(){
		System.out.println("ArtikelNr: " +artikelNr+ " \nBezeichnung: " +bezeichnung+ " \nEinkaufspreis: " +einkaufspreis+ " Euro \nLagerzeit: " +lagerzeit+ " Monate");
		
	}
	
	public int berechneVerkaufspreis(){
		double verkaufspreis = einkaufspreis + (einkaufspreis*HANDELSSPANNE) + (einkaufspreis*MWST);
		return (int) verkaufspreis;
	}
}

class Sonderposten extends Artikel
{
	double rabatt = 0.1;
	
	public Sonderposten(int artnr, String bez, double ekp, int lgz){
		super(artnr, bez, ekp, lgz);
		if (lagerzeit >= 12){
			rabatt = 0.30;
		}
	}
	
	public void anzeigen(){
		System.out.println("Sonderposten! Rabatt: " + (int)(rabatt*100) + "%");
		super.anzeigen();
	}
	
	public int berechneVerkaufspreis(){
		double verkaufspreis = einkaufspreis + (einkaufspreis*HANDELSSPANNE) + (einkaufspreis*MWST);
		verkaufspreis = verkaufspreis - (verkaufspreis*rabatt);
		return (int) verkaufspreis;
	}
	
}


class artikeltester
{
	public static void main ( String args[] ){
	
		Artikel schnaps = new Artikel(341, "Hempels Obstler", 8.95, 7);
		Artikel likoer = new Artikel(221, "Sahnetoffee", 12.50, 3);
		Sonderposten fusel = new Sonderposten(121, "Boelkstoff", 6.32, 9);
		Sonderposten fasel = new Sonderposten(158, "Sommerbier", 5.60, 17);
		
		System.out.println("");
		schnaps.anzeigen();
		System.out.println("Verkaufspreis: " + schnaps.berechneVerkaufspreis() + " Euronen");
		System.out.println("");
		likoer.anzeigen();
		System.out.println("Verkaufspreis: " + likoer.berechneVerkaufspreis() + " Euronen");
		System.out.println("");
		fusel.anzeigen();
		System.out.println("Verkaufspreis: " + fusel.berechneVerkaufspreis() + " Euronen");
		System.out.println("");
		fasel.anzeigen();
		System.out.println("Verkaufspreis: " + fasel.berechneVerkaufspreis() + " Euronen");	
		System.out.println("");		
	}
}
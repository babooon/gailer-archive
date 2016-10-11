// hab kein IDE, package musste ich entfernen

import java.util.*;				//util ganz laden, damit ich arrays.fill() benutzen kann

public class vokalscan {		// name geaendert
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String sentence,antwort;
		char ch;
		int[] count = new int[6];
		
		/*
	        * count[0] = a
	        * count[1] = e
	        * count[2] = i
	        * count[3] = o
	        * count[4] = u
	        * count[5] = Konsonanten und Sonderzeichen
	        */
	        
		do{
		System.out.println("Bitte geben Sie einen Satz ein:");
		sentence=sc.nextLine();
		
		// Using next() will only return what comes before a space. 
		// nextLine() automatically moves the scanner down after returning the current line.
		
			for(int j=0;j<=sentence.length()-1;j++){
				ch = sentence.charAt(j);
			
				switch (ch){
					case 'a':
					case 'A':count[0]++;
						break;
					case 'e':
					case 'E':count[1]++;
						break;
					case 'i':
					case 'I':count[2]++;
						break;
					case 'o':
					case 'O':count[3]++;
						break;
					case 'u':
					case 'U':count[4]++;
						break;
					default:count[5]++;
						break;
				}
			}
		System.out.print("a: "+count[0]+"\ne: "+count[1]+"\ni: "+count[2]+"\no: "+count[3]+"\nu: "+count[4]+"\nKonsonanten u. Sonderzeichen: "+count[5]);
		
		Arrays.fill(count,0);			// count leeren/nullen, hat einfach gefehlt
		
		System.out.println("\nBeenden? (j oder n)");
		antwort=sc.nextLine();
		
		
		}
		while(antwort.equals("n"));		// so vergleicht man strings
		
		sc.close();
	}	
}
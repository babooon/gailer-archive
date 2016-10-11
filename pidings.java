public class pidings {
	public static void main(String[] args){
		
		int zaehler=4,intErgebnis,i=1,j;
		double nenner=3,ergebnis=4,bruch=0;
		boolean addition=false;
		int[] vergleich={314,3141,31415,314159};
		int[] durchlauf=new int[4];
		
		/*bruch ist ein Dezimalbruch der aus zaehler/nenner errechnet wird.
		 * der vergleich der werte wird durch das verschieben der kommastellen und das casten des Ergebnisses zu einem intErgebnis realisiert.
		 * dadurch werden die nicht relevanten nachkommastellen abgeschnitten.
		 * die vergleichswerte befinden sich in einem array.
		 */
		
		for(j=0;j<=3;j++){
			for(;;i++){
				
				/*innere schleife arbeitet den algorithmus zum errechnen von pi ab
				 * und vergleicht intErgebnis mit vergleich[j]
				 * wenn vergleich stimmt --> break
				 */
				
				bruch=zaehler/nenner;
			
				if(addition){
					ergebnis=ergebnis+bruch;
				}
				else{
					ergebnis=ergebnis-bruch;
				}
				intErgebnis=(int)(ergebnis*Math.pow(10,(j+2)));
				
				System.out.println(ergebnis+"\t\t"+intErgebnis+"\n");
			
				if(intErgebnis==vergleich[j]){
					break;
				}
				addition=!addition;
				nenner+=2;
			}
			//äußere schleife speichert den durchlauf für vergleich stimmt in durchlauf[j]
			
			durchlauf[j]=i;
			addition=!addition;
			nenner+=2;
			}	
		System.out.println("Durchläufe für:\t3,14\t\t"+durchlauf[0]+"\n\t\t3,141\t\t"+durchlauf[1]+"\n\t\t3,1415\t\t"+durchlauf[2]+"\n\t\t3,14159\t\t"+durchlauf[3]);
	}
}


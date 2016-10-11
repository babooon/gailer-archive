import java.util.Scanner;

class keil{

  public static void main (String[] args){
	
	Scanner scan = new Scanner(System.in);
	int n;
	int stars;
	int spaces=0;
	
    System.out.print("Anfangszahl der Sterne: ");
	stars = scan.nextInt();
    System.out.println("");
	
    while(stars>0){
	
		for(n=0; n<spaces; n++){
			System.out.print(" ");
        }
		
        for(n=stars; n>0; n--){
            System.out.print("*");
        }		
		
        System.out.println("");
		
        stars--;
		spaces++;
    }
  }
}
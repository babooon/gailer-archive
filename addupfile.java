import java.util.Scanner;

class AddUpFile
{
  public static void main ( String[] args )  
  {
    Scanner scan = new Scanner( System.in );
    int value;
    int sum = 0 ;       // initialize sum
	int max;
	String prompt = "no";
	
	System.out.println("Prompts? yes/no?") ;
	prompt  = scan.next() ;
	if (prompt.equals("yes")){
		System.out.print("Enter a number 000: ");
	}
	value  = scan.nextInt() ;
	max = value;
	sum = sum + value;
	
    int count = 2 ;     // initialize count
    while ( count <= 20 )
    {
	if (prompt.equals("yes")){
      System.out.print("Enter a number: ") ;
	}
      value  = scan.nextInt() ;    // get next integer
      sum    = sum + value;        // add to the sum
      count  = count + 1 ;         // increment count
	  if (max < value){
		max = value;
	  }
    }

    System.out.println( "Grand Total: " + sum + " Maximum: " + max + " Prompts: " + prompt);
  }
}
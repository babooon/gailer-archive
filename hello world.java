import java.awt.*;
import java.util.*;

class Hello
{
  public static void main ( String[] args ){
  
  String eingabe = "";
  Scanner scan = new Scanner( System.in );
  
  while (!eingabe.equals("//done")){
	eingabe = scan.nextLine();
	System.out.println(eingabe);
	}
  }
}
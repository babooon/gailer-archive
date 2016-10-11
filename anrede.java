import java.awt.*;
import java.util.*;

class anrede
{
  public static void main(String[] args)
  {	
	Scanner scan = new Scanner( System.in );
	String str = new String("noname");
	
	while (!str.equals(""))
	{
	System.out.println("Geben Sie einen Namen ein");
	str = scan.nextLine();
	
	if (str.equals("Amy") | str.equals("Buffy") | str.equals("Cathy") | str.equals("Elroy") | str.equals("Fred") | str.equals("Graham"))
		{
		if (str.equals("Amy") | str.equals("Buffy") | str.equals("Cathy"))
		System.out.println("Ms. " + str);
		if (str.equals("Elroy") | str.equals("Fred") | str.equals("Graham"))
		System.out.println("Mr. " + str);
		}
	else
	System.out.println(str);
	}
  }
}
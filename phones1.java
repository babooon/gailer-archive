///// sloppy but /edit: not/ working


import java.util.*;


class PhoneEntry {
	String firstname;    // name of a person
	String lastname;
	String phone;   // their phone number
	PhoneEntry( String fn, String ln, String p ) {
		firstname = fn; 
		lastname = ln;
		phone = p;
	}
}

class PhoneBook
{ 
 PhoneEntry[] phoneBook; 
 PhoneBook()    // constructor
 {
   phoneBook = new PhoneEntry[ 8 ] ;
   phoneBook[0] = new PhoneEntry( "James", "Barclay", "(418)665-1223" ); 
   phoneBook[1] = new PhoneEntry( "Grace", "Dunbar",  "(860)399-3044" );
   phoneBook[2] = new PhoneEntry( "Paul", "Kratides", "(815)439-9271" );
   phoneBook[3] = new PhoneEntry( "Violet", "Smith",  "(312)223-1937" );
   phoneBook[4] = new PhoneEntry( "John", "Wood", "(913)883-2874" );
   phoneBook[5] = new PhoneEntry( "John", "Smith", "(913)883-2874" );
   phoneBook[6] = new PhoneEntry( "Willoughby", "Smith","(913)883-2874" );
 }

 PhoneEntry search( String lastnametarget, String firstnametarget )  {
	
	if (!firstnametarget.equals("leer")){
	
		for (int j=0; j<phoneBook.length; j++){
			if ( phoneBook[ j ].name.toUpperCase().equals( targetName.toUpperCase() ))
				return phoneBook[ j ];
		}
	}
	
	if (firstnametarget.equals("leer")){
		
		
	}
   return null;
 }
}

class PhoneBookTester
{
 public static void main (String[] args)
 {
	Scanner scan = new Scanner(System.in);
 
   PhoneBook pb = new PhoneBook();  
   
   String vorname = "leer";
   String nachname = "leer";
  
	while (!query.equals("quit")){
	
		vorname = "leer";
		nachname = "leer";
		
		System.out.println("Last Name?");
		nachname = scan.nextLine();
		System.out.println("First Name?");
		vorname = scan.nextLine();
		
		
		PhoneEntry entry = pb.search(nachname, vorname); 

		if ( entry != null && !nachname.equals("leer") )
			System.out.println( entry.firstname + " " + entry.lastname + ": " + entry.phone );
     
		else
			System.out.println("Name not found");

	 
	} 
	
	System.out.println("BB, Bunghole!");
 }
}
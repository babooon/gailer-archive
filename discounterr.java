import java.util.Scanner;
class DiscountErr
{
  public static void main ( String[] args ) 
  {
    int listPrice;
    int discount;
    int discountPrice;

    Scanner scan = new Scanner( System.in );

    System.err.print("Enter list price in cents: ");      // print prompt on monitor
    listPrice = scan.nextInt();
    System.out.println("Price in cents: " + listPrice );  // echo to standard output

    System.err.print("Enter discount in percent: ");      // print prompt on monitor
    discount = scan.nextInt();
    System.out.println("Discount: " + discount );         // echo  to standard output

    discountPrice = listPrice - (listPrice*discount)/100 ;

    System.out.println( "Discount Price: " + discountPrice );    // send to disk file
    System.err.println( "Discount Price: " + discountPrice );    // send to monitor
  }
}
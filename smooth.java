import java.io.* ;
import java.lang.*;
import java.util.Scanner;


class Smooth
{

  private static void printArray( int[][] data )
  {
    for ( int row=0; row < data.length; row++)
    {
      for ( int col=0; col < data[row].length-1; col++) 
         System.out.print( data[row][col] + ", " );
      System.out.println( data[row][data[row].length-1] ); 
    }
  }


  public static void main ( String[] args ) throws FileNotFoundException
  {
  
  
	File input = new File( "imgcreator.txt" );      
    Scanner scan = new Scanner( input );

	int[][] image = new int[64][64];
	

	try{
	
	while (scan.hasNext()){
		for (int row=0; row<64; row++){
			for (int col=0; col<64; col++){
				image[row][col] = Integer.parseInt(scan.nextLine());
			}
		}
	}
	}
	catch(ArrayIndexOutOfBoundsException e){System.out.println("Shitty image didnt load: " +e);}
	
	/*
    int[][] image  = {{0,0,0,0,0,0,0,0,0,0,0,0},
                      {0,0,0,0,0,0,0,0,0,0,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,5,5,5,5,12,5,5,5,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,0,0,0,0,0,0,0,0,0,0},
                      {0,0,0,0,0,0,0,0,0,0,0,0}};

					  
	*/
	
    // assume a rectangular image
    int[][] smooth = new int[ image.length ][ image[0].length ];
    
    // Compute the smoothed value for 
    // non-edge locations in the image.

    for ( int row=1; row<image.length-1; row++ )
    {
      for ( int col=1; col<image[row].length-1; col++ )
      {
        int sum = image[row][col];
		int howmany = 1;
		
		try{ sum += image[row-1][col-1]; howmany++;}
		catch(ArrayIndexOutOfBoundsException e){}
		
		try{ sum += image[row-1][col]; howmany++;}
		catch(ArrayIndexOutOfBoundsException e){}
		
		try{ sum += image[row-1][col+1]; howmany++;}
		catch(ArrayIndexOutOfBoundsException e){}
		
		try{ sum += image[row][col-1]; howmany++;}
		catch(ArrayIndexOutOfBoundsException e){}
		
		try{ sum += image[row][col+1]; howmany++;}
		catch(ArrayIndexOutOfBoundsException e){}
		
		try{ sum += image[row+1][col-1]; howmany++;}
		catch(ArrayIndexOutOfBoundsException e){}
		
		try{ sum += image[row+1][col]; howmany++;}
		catch(ArrayIndexOutOfBoundsException e){}
		
		try{ sum += image[row+1][col+1]; howmany++;}
		catch(ArrayIndexOutOfBoundsException e){}
		
		
        smooth[row][col] = (int) Math.round((double)sum/(double)howmany);
      }
    }
      
    printArray(image);
	
	System.out.println("\nNow the smoothened image!\n");
    
    printArray(smooth);

  }
}      
import java.io.* ;

class Smooth2
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


  public static void main ( String[] args )
  {
    int[][] image  = {{0,0,0,0,0,0,0,0,0,0,0,0},
                      {0,0,0,0,0,0,0,0,0,0,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,0,0,0,0,0,0,0,0,0,0},
                      {0,0,0,0,0,0,0,0,0,0,0,0}};

    // assume a rectangular image
    int[][] smooth = new int[ image.length ][ image[0].length ];
    
    // Compute the smoothed value for 
    // non-edge locations in the image.

    for ( int row=1; row<image.length-1; row++ )
    {
      for ( int col=1; col<image[row].length-1; col++ )
      {
        double sum = image[row][col];
		int howmany = 1;
		/*
		try{ sum += smooth[row-1][col-1]; howmany++;}
		catch(ArrayIndexOutOfBoundsException e){System.out.println((row-1)+" "+(col-1)+" doesnt exist!");}
		
		try{ sum += smooth[row-1][col]; howmany++;}
		catch(ArrayIndexOutOfBoundsException e){System.out.println((row-1)+" "+(col)+" doesnt exist!");}
		
		try{ sum += smooth[row-1][col+1]; howmany++;}
		catch(ArrayIndexOutOfBoundsException e){System.out.println((row-1)+" "+(col+1)+" doesnt exist!");}
		
		try{ sum += smooth[row][col-1]; howmany++;}
		catch(ArrayIndexOutOfBoundsException e){System.out.println((row)+" "+(col-1)+" doesnt exist!");}
		
		try{ sum += smooth[row][col+1]; howmany++;}
		catch(ArrayIndexOutOfBoundsException e){System.out.println((row)+" "+(col+1)+" doesnt exist!");}
		
		try{ sum += smooth[row+1][col-1]; howmany++;}
		catch(ArrayIndexOutOfBoundsException e){System.out.println((row+1)+" "+(col-1)+" doesnt exist!");}
		
		try{ sum += smooth[row+1][col]; howmany++;}
		catch(ArrayIndexOutOfBoundsException e){System.out.println((row+1)+" "+(col)+" doesnt exist!");}
		
		try{ sum += smooth[row+1][col+1]; howmany++;}
		catch(ArrayIndexOutOfBoundsException e){System.out.println((row+1)+" "+(col+1)+" doesnt exist!");}
		*/
		
        smooth[row][col] = (int)(sum/howmany);
		//System.out.println(sum);
      }
    }
      
    printArray(image);
	
	System.out.println("\nNow the smoothened image!\n");
    
    printArray(smooth);

  }
}      
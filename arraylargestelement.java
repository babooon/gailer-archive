import java.io.* ;

class ArrayLargestElement
{

  public static void main ( String[] args )  
  {
    int[][] data = { {3, 2, 5},
                     {1, 4, 4, 8, 13},
                     {9, 1, 0, 2},
                     {0, 2, 6, 3, -1, -8} };
    
    int rowmax;
    
	
    for ( int row=0; row < data.length; row++)
    {
		rowmax = data[0][0];
		
      for ( int col=0; col < data[row].length; col++) 
      {
		if (data[row][col] > rowmax)
			rowmax = data[row][col];
      }
	  
	      // write out the results
    System.out.println( "rowmax row "+row+" = "+rowmax);
    }
      


  }
}      
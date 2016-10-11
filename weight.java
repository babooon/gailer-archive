import java.io.* ;

class Weight
{
  int[] data;
  
  // Constructor
  Weight(int[] init)
  {
    // Construct the array the same length
    // as that referenced by init.
    data = new int[init.length];
    
    // Copy values from the 
    // input data to data.
    for (int j = 0; j < data.length; j++)
    {
      data[j] = init[j];
    }
  }
  
  //Print
  void print(){
    for (int j = 0; j < data.length; j++){
      System.out.println(data[j]);
    }
  }
  
  int average(){
	int sum = 0;
	for (int j = 0; j < data.length; j++){
		sum += data[j];
	}
	return (sum / data.length);
  }
  
  int subAverage( int start, int end ){
	int sum = 0;
	for (int j = start-1; j < end; j++){
		sum += data[j];
	}
	return (sum / (end-start+1));
  }
  
  public static void main ( String[] args )
  {
    int[] values = { 98,  99,  98,  99, 100, 101, 102, 100, 104, 105,
                    105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
                    105, 105, 104, 104, 103, 102, 102, 101, 100, 102};
    Weight june = new Weight( values );
    june.print();
	
	int avg = june.average();
    System.out.println("average = " + avg );
	
	int subavg = june.subAverage(1,15);
    System.out.println("average day 1-15 = " + subavg );
	
	int subavg2 = june.subAverage(16,30);
    System.out.println("average day 16-30 = " + subavg2 );
  }
}
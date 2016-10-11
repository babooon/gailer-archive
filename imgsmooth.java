import java.io.* ;
import java.lang.*;
import java.util.Scanner;


class Smooth{

	public static String createimg() throws FileNotFoundException, IOException{

		Scanner scan = new Scanner( System.in );
		System.out.println("pls enter some filename!");
		String filename = scan.nextLine();
		File output = new File( filename );
		output.createNewFile();
		PrintStream  print = new PrintStream( output );
	
		for (int i=0; i < 8*64; i++)
			print.println("0");
			
		for (int i=0; i < 8*64; i++)
			print.println("8");
		
		for (int i=0; i < 8*64; i++)
			print.println("16");
			
		for (int i=0; i < 8*64; i++)
			print.println("24");
			
		for (int i=0; i < 8*64; i++)
			print.println("32");
			
		for (int i=0; i < 8*64; i++)
			print.println("40");
			
		for (int i=0; i < 8*64; i++)
			print.println("48");
			
		for (int i=0; i < 8*64; i++)
			print.println("56");
			
		print.close();
		
		return filename;
	}
	
	public static int[][] smoothen(String filename) throws FileNotFoundException{
		
		int[][] image = new int[64][64];
		File input = new File( filename );      
		Scanner scan = new Scanner( input );
		
		try{
			while (scan.hasNext()){
				for (int row=0; row<64; row++){
					for (int col=0; col<64; col++){
						image[row][col] = Integer.parseInt(scan.nextLine());
					}
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Shitty image didnt load: " +e);
		}

		int[][] smooth = new int[ image.length ][ image[0].length ];

		for (int row=1; row<image.length-1; row++){
			for (int col=1; col<image[row].length-1; col++){
			
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
			
				smooth[row][col] = (int)Math.round((double)sum/howmany);
			}
		}	
		return smooth;
	}
	
	public static void display(int[][] array){
		
		for (int row=0; row<64; row++){
			for (int col=0; col<64; col++){
			
				switch (array[row][col] / 8) {
					case 0: System.out.print(" ");
							break;
					case 1: System.out.print(".");
							break;
					case 2: System.out.print(",");
							break;
					case 3: System.out.print("+");
							break;
					case 4: System.out.print("c");
							break;
					case 5: System.out.print("o");
							break;
					case 6: System.out.print("O");
							break;
					case 7: System.out.print("X");
							break;
					default: System.out.print("FAIL");
							break;
				}
			}
			System.out.println("");
		}
	
	}
	
	public static void main ( String[] args ) throws FileNotFoundException, IOException{
		
		display( smoothen( createimg() ));
	}
	
}
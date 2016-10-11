

class addtest{


public static int mult(int a, int b) {
	if (a == 0 || b == 0)
		return 0; 
	else 
		return addi(a, mult(a, addi(b,-1)));
}


public static void nummer(){
	System.out.print("aack ");
}

public static int addi(int a, int b){
	int z = a + b;
	nummer();
	return z;
}

public static int fac(int n){

	if (n>=1)
		return mult(n, fac(addi(n,-1)));
	else
		return 1;
}


public static void main (String[] args){

int nummer = 0;

int x = 12;
int y = 5;
int n = 5;
int z;


z = mult(x,y);
int f = fac(n);
/*
while (y > 0){
    z = addi(z,x);
    y = addi(y,-1);
}
*/



System.out.println( z );
System.out.println( f );
//System.out.println( nummer );
}
}
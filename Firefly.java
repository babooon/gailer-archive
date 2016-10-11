import java.util.*;
import java.lang.*;


class Firefly{

	double x, y, z;	// koordinaten
	double u, v, w;	// hilfsvariablen
	boolean alive;
	int nr;
	Random rand = new Random();
	
	Firefly(int nr){	// ein gluehwurm wird random gesetzt in einen 20*20*20 bereich, koordinaten jeweils von -10 bis +10
		x = rand.nextDouble()*20.0 -10.0;
		y = rand.nextDouble()*20.0 -10.0;
		z = rand.nextDouble()*20.0 -10.0;
		alive = true;
		this.nr = nr;	
	}

	void move(){	// gluehwuermer bewegen sich random um -1 bis +1 und gehen nicht aus dem feld
	
		u = x + rand.nextDouble()*2.0 -1.0;
		v = y + rand.nextDouble()*2.0 -1.0;
		w = z + rand.nextDouble()*2.0 -1.0;
		
		if (u > 10.0) u = 10.0;
		if (u < -10.0) u = -10.0;
		x = u;
			
		if (v > 10.0) v = 10.0;
		if (v < -10.0) v = -10.0;
		y = v;
			
		if (w > 10.0) w = 10.0;
		if (w < -10.0) w = -10.0;
		z = w;
	}
	
	void collision(Firefly a, Firefly b){
		if (Math.sqrt(Math.pow(a.x-b.x,2)+Math.pow(a.y-b.y,2)+Math.pow(a.z-b.z,2)) <= 1.0){	// euklidsche 3d-abstandsformel
			b.alive = false;
			System.out.println("COLLISION! Firefly " + b.nr + " was killed by Firefly " + a.nr);
		}
	}
}


class FireflyTester{

	public static void main (String[] args){
		
		Firefly[] flies = new Firefly[10];
		for (int i = 0; i <= flies.length-1; i++){
			flies[i] = new Firefly(i);					// 10 gluehwuermer erstellen
		}
				int flycount = flies.length-1;
		
		while (flycount >= 2){
		
			for (int i = 0; i <= flies.length-1; i++){
				flies[i].move();						// die sich alle bewegen
				
				for (int j = 0; j <= flies.length-1; j++){
					if (!(flies[j] == flies[i])) 
						if (flies[j].alive && flies[i].alive)
							flies[i].collision(flies[j],flies[i]);	// und sich ausloeschen wenn sie sich treffen.
				}
			}
			
			flycount = 0;
			for (int i = 0; i <= flies.length-1; i++){				// wuermer zaehlen!
				if (flies[i].alive){
					flycount += 1;
				}
			}	
		}
		System.out.println("Last fly flying! The brutal battle finally ended.");
	}	
}
package factory;

import java.util.Random;

public class EasySpawner implements Factory{

	public Enemy spawn() {
		Random r = new Random();
		double k;
		k = r.nextDouble();
		if(k < 0.85) {
			return new Minion();
		}
		else if(k < 0.99) {
			return new Elite();
		}
		else {
			return new Boss();
		}
	}
	
}

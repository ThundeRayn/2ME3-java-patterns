package factory;

import java.util.Random;

public class AverageSpawner implements Factory{

	@Override
	public Enemy spawn() {
		Random r = new Random();
		double k;
		k = r.nextDouble();
		if(k < 0.65) {
			return new Minion();
		}
		else if(k < 0.9) {
			return new Elite();
		}
		else {
			return new Boss();
		}
	}

}

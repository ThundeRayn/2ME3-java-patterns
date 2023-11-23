package factory;

import java.util.Random;

public class BossSpawner implements Factory{

	@Override
	public Enemy spawn() {
		Random r = new Random();
		double k;
		k = r.nextDouble();
		if(k < 0.0) {
			return new Minion();
		}
		else if(k < 0.0) {
			return new Elite();
		}
		else {
			return new Boss();
		}
	}

}

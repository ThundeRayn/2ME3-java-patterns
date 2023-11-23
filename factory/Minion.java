package factory;

public class Minion extends Enemy{

	public Minion() {
		super();
		strength = 1;
		health = 5;
	}
	
	@Override
	public void takeDamage(int damage) {
		System.out.println("Minion takes: "+ damage +" damage.");
		health -= damage;
		if(health <= 0) {
			System.out.println("The Minion is dead.");
		}
	}

	@Override
	public void attack() {
		if(health <= 0) {
			return;
		}
		System.out.println("Minion attacks for: "+ strength +" damage.");
	}
	
}

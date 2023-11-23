package factory;

public class Boss extends Enemy{

	public Boss() {
		super();
		strength = 7;
		health = 50;
	}
	
	@Override
	public void takeDamage(int damage) {
		System.out.println("Boss takes: "+ damage +" damage.");
		health -= damage;
		if(health <= 0) {
			System.out.println("The Boss is dead.");
		}
	}

	@Override
	public void attack() {
		if(health <= 0) {
			return;
		}
		health += 3;
		System.out.println("Boss attacks for: "+ strength +" damage, and life leeches 3 health.");
	}
	
}

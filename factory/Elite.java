package factory;

public class Elite extends Enemy{

	public Elite() {
		super();
		strength = 3;
		health = 10;
	}
	
	@Override
	public void takeDamage(int damage) {
		System.out.println("Elite takes: "+ damage +" damage.");
		health -= damage;
		if(health <= 0) {
			System.out.println("The Elite is dead.");
		}
	}

	@Override
	public void attack() {
		if(health <= 0) {
			return;
		}
		System.out.println("Elite attacks for: "+ strength +" damage.");
	}

}

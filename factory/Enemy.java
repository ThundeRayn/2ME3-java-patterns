package factory;

public abstract class Enemy {

	protected int health;
	protected int strength;
	
	public abstract void takeDamage(int damage);
	public abstract void attack();
	
}

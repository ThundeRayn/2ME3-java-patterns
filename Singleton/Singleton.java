public class Singleton implements Enemy{
	
	private static Singleton instance;
	
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	private Singleton(int value) {
		this.value = value;
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton(0);
			return instance;
		}
		return instance;
	}

	@Override
	public void attack() {
		System.out.println("Attack");
		
	}

	@Override
	public void takeDamage(int damage) {
		System.out.println("Take damage");
		
	}
	
}

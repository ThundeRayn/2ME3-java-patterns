package Adapters;

public class TheOne {
	
	private int x;
	private static TheOne instance;
	
	public static TheOne getInstance() {
		if(instance == null) {
			instance = new TheOne();
		}
		return instance;
	}
	
	private TheOne() {}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
}


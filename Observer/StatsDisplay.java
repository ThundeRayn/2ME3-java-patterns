package Observer;

public class StatsDisplay implements Display{

	private double temp;
	private double humidity;
	private double pressure;
	
	public void update(double temp, double humidity, double pressure) {
		// TODO Auto-generated method stub
		display();
	}
	
	public void display() {
		return;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}

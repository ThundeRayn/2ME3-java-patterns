package Observer;

public class ProblemDisplay implements Display{

	private double temp;
	private double humidity;
	private double pressure;
	
	private WeatherStation ws;
	
	public ProblemDisplay(WeatherStation ws) {
		this.ws = ws;
		ws.addDisplay(this);
	}
	
	@Override
	public void update() {
		humidity = ws.getHumidity();
		temp = ws.getTemp();
		pressure = ws.getPressure();
		display();
		ws.update();
	}

	@Override
	public void display() {
		System.out.println("I'm a problem");
		
	}

}

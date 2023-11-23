package Observer;

public class TextDisplay implements Display{

	private double temp;
	private double humidity;
	private double pressure;
	private boolean isSubbed = false;
	
	private WeatherStation ws;
	
	public TextDisplay(WeatherStation ws) {
		this.ws = ws;
		sub();
	}
	
	public void unSub() {
		ws.removeDisplay(this);
		isSubbed = false;
	}
	
	public void sub() {
		if(!isSubbed) {
			ws.addDisplay(this);
		}
		isSubbed = true;
		humidity = ws.getHumidity();
		temp = ws.getTemp();
		pressure = ws.getPressure();
	}
	
	public void display() {
		System.out.println("-------- Text Display --------");
		System.out.println("Temp: " + temp);
		System.out.println("Humidity: " + humidity);
		System.out.println("Pressure: " + pressure + "\n");
	}

	@Override
	public void update() {
		humidity = ws.getHumidity();
		temp = ws.getTemp();
		pressure = ws.getPressure();
		display();
	}

}

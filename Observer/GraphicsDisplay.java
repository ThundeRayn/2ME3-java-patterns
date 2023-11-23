package Observer;

public class GraphicsDisplay implements Display{

	private double temp;
	private double humidity;
	private double pressure;
	
	public void update(double temp, double humidity, double pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}
	
	public void display() {
		System.out.println("---- Graphics Display ----");
		//Just some ASCII graphics for demonstration
		String s = "";
		for(int i = 0; i < temp/5; i++) {
			s += "*";
		}
		System.out.println("temp: " + s);
		s = "";
		for(int i = 0; i < pressure/5; i++) {
			s += "*";
		}
		System.out.println("pressure: " + s + "\n");
		s = "";
		for(int i = 0; i < humidity/5; i++) {
			s += "*";
		}
		System.out.println("pressure: " + s + "\n");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}


}

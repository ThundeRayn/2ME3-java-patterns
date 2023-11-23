package Observer;

import java.util.ArrayList;

import Observer.Subject.Subject;

public class WeatherStation extends Subject{

	private double temp;
	private double humidity;
	private double pressure;
	
	private ArrayList<Display> displays = new ArrayList<Display>();
	
	public WeatherStation() {
		temp = 0;
		humidity = 0;
		pressure = 0;
	}
	
	public void update() {
		for(Display display: displays) {
			display.update();
		}
	}
	
	public double getTemp() {
		return temp;
	}
	
	public void setTemp(double temp) {
		this.temp = temp;
		update();
	}
	
	public double getHumidity() {
		return humidity;
	}
	
	public void setHumidity(double humidity) {
		this.humidity = humidity;
		update();
	}
	
	public double getPressure() {
		return pressure;
	}
	
	public void setPressure(double pressure) {
		this.pressure = pressure;
		update();
	}
	
	public void addDisplay(Display display) {
		displays.add(display);
	}
	
	public void removeDisplay(Display display) {
		displays.remove(display);
	}
}


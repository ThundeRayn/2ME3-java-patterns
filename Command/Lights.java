public class Lights {

	private boolean isOn;
	
	public Lights() {
		isOn = false;
	}
	
	public void turnOn() {
		System.out.println("Turning lights on");
		isOn = true;
	}
	
	public void turnOff() {
		System.out.println("Turning lights off");
		isOn = false;
	}
	
}

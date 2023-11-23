public class Speaker {

	private final int MAX_VOLUME = 5;
	private int volume;
	
	public Speaker() {
		volume = 0;
	}
	
	public void turnUp() {
		if(volume < MAX_VOLUME) {
			volume++;
		}
		System.out.println("Speaker turned up to: " + volume);
	}
	
	public void turnDown() {
		if(volume > 0) {
			volume--;
		}
		System.out.println("Speaker turned down to: " + volume);
	}
	
	
}

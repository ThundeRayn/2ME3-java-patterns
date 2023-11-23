public class Runner {

	public static void main(String[] args) {
		Remote remote = new Remote();
		
		Lights lights = new Lights();
		Speaker speaker = new Speaker();
		
		Command lightOn = new LightOnCommand(lights);
		Command lightOff = new LightOffCommand(lights);
		Command speakerUp = new SpeakerUpCommand(speaker);
		Command speakerDown = new SpeakerDownCommand(speaker);
		
		
		remote.setCommand(0, lightOn, lightOff);
		remote.setCommand(1, speakerUp, speakerDown);
		
		remote.pressButton(1, true);
		remote.pressButton(1, true);
		remote.pressButton(1, true);
		remote.pressButton(1, true);
		remote.pressButton(1, true);
		
		remote.undoLast();
		remote.pressButton(0, true);
		remote.undoLast();
		remote.undoLast();
		remote.undoLast();
		remote.undoLast();
		//remote.undoLast();
		
	}
	
}

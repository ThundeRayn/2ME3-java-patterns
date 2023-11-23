
public class SpeakerUpCommand implements Command{

	private Speaker speaker;
	
	public SpeakerUpCommand(Speaker speaker) {
		this.speaker = speaker;
	}
	
	@Override
	public void execute() {
		speaker.turnUp();
	}

	@Override
	public void undo() {
		speaker.turnDown();
	}

}

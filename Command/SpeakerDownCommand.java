public class SpeakerDownCommand implements Command{

	private Speaker speaker;
	
	public SpeakerDownCommand(Speaker speaker) {
		this.speaker = speaker;
	}
	
	@Override
	public void execute() {
		speaker.turnDown();
	}

	@Override
	public void undo() {
		speaker.turnUp();
		
	}
	
}

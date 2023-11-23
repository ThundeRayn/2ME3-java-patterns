public class LightOffCommand implements Command{

private Lights lights;
	
	public LightOffCommand(Lights lights) {
		this.lights = lights;
	}

	@Override
	public void execute() {
		lights.turnOff();
	}

	@Override
	public void undo() {
		lights.turnOn();
	}

	
}

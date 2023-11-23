public class LightOnCommand implements Command{

	private Lights lights;
	
	public LightOnCommand(Lights lights) {
		this.lights = lights;
	}

	@Override
	public void execute() {
		lights.turnOn();
	}

	@Override
	public void undo() {
		lights.turnOff();
	}

	
}

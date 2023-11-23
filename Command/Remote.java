public class Remote {

	private Command[] onCommands; 
	private Command[] offCommands;
	
	private Stack stack = new Stack();
	
	private final int NUM_OF_BUTTONS = 5;

	public Remote() {
		onCommands = new Command[NUM_OF_BUTTONS];
		offCommands = new Command[NUM_OF_BUTTONS];
	}
	
	public void setCommand(int slot, Command on, Command off) {
		onCommands[slot] = on;
		offCommands[slot] = off;
	}
	
	public void pressButton(int slot, boolean on) {
		if(on) {
			onCommands[slot].execute();
			stack.push(onCommands[slot]);
		}
		else {
			offCommands[slot].execute();
			stack.push(offCommands[slot]);
		}
	}
	
	public void undoLast() {
		stack.pop().undo();
	}
	
}

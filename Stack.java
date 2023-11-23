import java.util.ArrayList;

public class Stack {

	private ArrayList<Command> stack = new ArrayList<Command>();
	
	public Stack() {}
	
	public void push(Command command) {
		stack.add(command);
	}
	
	public Command pop() {
		Command command = stack.get(stack.size()-1);
		stack.remove(stack.size()-1);
		return command;
	}
	
}

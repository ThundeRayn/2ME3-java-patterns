package Observer.Subject;

import Observer.Display;

public abstract class Subject {

	public abstract void addDisplay(Display display);
	public abstract void removeDisplay(Display display);
	protected abstract void update();
	
}

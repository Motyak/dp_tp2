package exo3;

import java.util.ArrayList;
import java.util.List;

public abstract class Sujet {
	protected List<Observer> observers;
	
	public Sujet() {
		this.observers = new ArrayList<Observer>();
	}
	
	abstract public void register(Observer o);
	abstract public void unregister(Observer o);
	abstract public void notifyOthers();
}

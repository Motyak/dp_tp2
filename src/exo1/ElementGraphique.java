package exo1;

public abstract class ElementGraphique {
	
	protected Mediator mediator;
	
	public ElementGraphique(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void notify(String msg) {
		this.mediator.notify(this, msg);
	}
	
	abstract public void receive(String msg);
}

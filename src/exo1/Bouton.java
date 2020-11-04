package exo1;

public abstract class Bouton extends ElementGraphique {
	
	public Bouton(Mediator mediator) {
		super(mediator);
	}

	abstract public void receive(String msg);
	
	abstract public void click();

}

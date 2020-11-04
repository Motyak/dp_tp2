package exo1;

public class BoutonAnnuler extends Bouton {

	public BoutonAnnuler(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void receive(String msg) {
		;
	}

	@Override
	public void click() {
		this.notify("annuler");
	}

}

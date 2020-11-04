package exo1;

public class BoutonAffiche extends Bouton {

	public BoutonAffiche(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void receive(String msg) {
		if(msg == "recherche") {
			System.out.println(this.toString() + " est grisé");
		}
		else if(msg == "annuler") {
			System.out.println(this.toString() + " est dégrisé");
		}
	}

	@Override
	public void click() {
		this.notify("affiche");
	}

}

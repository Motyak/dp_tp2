package exo1;

public class BoutonRecherche extends Bouton {

	public BoutonRecherche(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void receive(String msg) {
		if(msg == "affiche") {
			System.out.println(this.toString() + " est grisé");
		}
		else if(msg == "annuler") {
			System.out.println(this.toString() + " est dégrisé");
		}
	}

	@Override
	public void click() {
		this.notify("recherche");
	}

}

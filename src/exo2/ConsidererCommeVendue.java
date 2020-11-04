package exo2;

public class ConsidererCommeVendue implements Commande {

	@Override
	public void execute(Voiture v) {
		v.setEtat(Voiture.Etat.VENDUE);
	}

}

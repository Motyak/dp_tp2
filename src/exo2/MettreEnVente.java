package exo2;

public class MettreEnVente implements Commande {

	@Override
	public void execute(Voiture v) {
		v.setEtat(Voiture.Etat.EN_VENTE);
	}

}

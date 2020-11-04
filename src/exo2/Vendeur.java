package exo2;

public class Vendeur {
	public void doIt(Voiture v, Commande cmd) {
		cmd.execute(v);
	}
}

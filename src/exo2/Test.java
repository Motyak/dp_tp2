package exo2;

public class Test {

	public static void main(String[] args) {
		Voiture v = new Voiture();
		Vendeur vendeur = new Vendeur();
		
		System.out.println("Mise en vente du vehicule :");
		vendeur.doIt(v, new MettreEnVente());
		v.afficherEtat();
		
		System.out.println("Vehicule vendu :");
		vendeur.doIt(v, new ConsidererCommeVendue());
		v.afficherEtat();
	}

}

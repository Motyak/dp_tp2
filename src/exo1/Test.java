package exo1;

public class Test {

	public static void main(String[] args) {
		Formulaire form = new Formulaire();
		
		Bouton btnAffiche = new BoutonAffiche(form);
		Bouton btnRecherche = new BoutonRecherche(form);
		Bouton btnAnnuler = new BoutonAnnuler(form);
		
		form.addElement(btnAffiche);
		form.addElement(btnRecherche);
		form.addElement(btnAnnuler);
		form.addElement(new ZoneDeTexte(form));
		
		System.out.println("Je clique sur le bouton affiche");
		btnAffiche.click();
		
		System.out.println("Je clique sur le bouton annuler");
		btnAnnuler.click();
		
		System.out.println("Je clique sur le bouton rechercher");
		btnRecherche.click();
	}

}

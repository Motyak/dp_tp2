package exo2;

public class Voiture {

	static public enum Etat {
		EN_VENTE, VENDUE;
		
		@Override
		public String toString() {
			if(this == EN_VENTE)
				return "en vente";
			else if(this == VENDUE)
				return "vendue";
			else
				return "";
		}
	}
	
	Etat etat;
	
	public Voiture() {
		this.etat = Etat.EN_VENTE;
	}
	
	public void setEtat(Etat e) {
		this.etat = e;
	}
	
	public void afficherEtat() {
		System.out.println(this.toString() + " est " + this.etat + "\n");
	}
	
}

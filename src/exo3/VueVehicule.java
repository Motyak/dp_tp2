package exo3;

public class VueVehicule implements Observer {

	private Vehicule sujet;
	
	private String descriptionVehicule;
	private double prixVehicule;
	
	public VueVehicule(Vehicule v) {
		this.sujet = v;
		descriptionVehicule = v.getDescription();
		prixVehicule = v.getPrix();
	}
	
	
	@Override
	public void update() {
		this.descriptionVehicule = sujet.getDescription();
		this.prixVehicule = sujet.getPrix();
	}
	
	public void draw() {
		System.out.println("description :\n" + this.descriptionVehicule);
		System.out.println("prix :\n" + this.prixVehicule + "\n");
	}

}

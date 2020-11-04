package exo3;

public class Vehicule extends Sujet {

	private String description;
	private double prix;

	public Vehicule(String description, double prix) {
		this.description = description;
		this.prix = prix;
	}
	
	public void setDescription(String desc) {
		this.description = desc;
	}
	
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public double getPrix() {
		return this.prix;
	}
	
	@Override
	public void register(Observer o) {
		this.observers.add(o);
	}

	@Override
	public void unregister(Observer o) {
		this.observers.remove(o);
	}

	@Override
	public void notifyOthers() {
		for(Observer o : this.observers)
			o.update();
	}

}

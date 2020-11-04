package exo3;

public class Test {

	public static void main(String[] args) {
		Sujet vehicule = new Vehicule("Voiture pas terrible", 5000.0);
		Observer vue = new VueVehicule((Vehicule)vehicule);
		vehicule.register(vue);
		
		((VueVehicule)vue).draw();
		
		((Vehicule)vehicule).setDescription("Super voiture");
		((Vehicule)vehicule).setPrix(99999.99);
		
		((VueVehicule)vue).draw();
		
//		ne prend effet qu'après le update de la vue
		vue.update();
		((VueVehicule)vue).draw();
	}

}

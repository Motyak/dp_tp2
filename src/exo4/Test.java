package exo4;

public class Test {
	
	public static void main(String[] args) {
		OptionFactory factory = new OptionFactory();
		Vehicule v1 = new Vehicule("Renault", 10000.0);
		Vehicule v2 = new Vehicule("Ferrari", 99999.9);
		v1.print();
		
		v2.ajouterOption("option1", 300.0, factory);
		v2.ajouterOption("option2", 150.0, factory);
		
		v2.print();
	}
	
}

package exo4;

import java.util.ArrayList;
import java.util.List;

import util.Pair;

public class Vehicule {
	private String marque;
	private double prix;
	private List<Pair<Option, Double>> options;
	
	public Vehicule(String marque, double prix) {
		this.marque = marque;
		this.prix = prix;
		this.options = new ArrayList<Pair<Option, Double>>();
	}
	
	public void ajouterOption(String nom, double prix, OptionFactory factory) {
		Option option = factory.createOption(nom);
		this.options.add(new Pair<Option, Double>(option, prix));
	}
	
	public void print() {
		System.out.println(marque + " - " + prix + "€\n");
		this.afficherOptions();
		System.out.println("--------------------------------");
	}
	
	private void afficherOptions() {
		if(this.options.isEmpty())
			System.out.println("\tAucune option\n");
		else
			for(Pair<Option, Double> option : this.options)
				System.out.println("\tNom: " + option.first.getNom() + "\n\tPrix: " + option.second + "\n");
	}
}

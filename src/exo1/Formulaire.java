package exo1;

import java.util.ArrayList;
import java.util.List;

public class Formulaire implements Mediator {

	private List<ElementGraphique> elements;
	
	public Formulaire() {
		this.elements = new ArrayList<ElementGraphique>();
	}
	
	public void addElement(ElementGraphique e) {
		this.elements.add(e);
	}
	
	@Override
	public void notify(ElementGraphique e, String msg) {
		for(ElementGraphique eg : this.elements) {
			eg.receive(msg);
		}
	}

}

package exo1;

public class ZoneDeTexte extends ElementGraphique {

	public ZoneDeTexte(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void receive(String msg) {
		System.out.println(this.toString() + " affiche \"" + msg + "\"\n");
	}
}

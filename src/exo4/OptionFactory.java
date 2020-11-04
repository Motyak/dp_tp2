package exo4;

public class OptionFactory {
	public Option createOption(String nom) {
		return new Option(nom);
	}
}

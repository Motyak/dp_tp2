package exo4;

import java.util.HashMap;

public class OptionFactory {
	
	private HashMap<String, Option> cache;
	
	public OptionFactory() {
		this.cache = new HashMap<String, Option>();
	}
	
	public Option createOption(String nom) {
		if(cache.containsKey(nom))
			return this.cache.get(nom);
		Option option = new Option(nom);
		this.cache.put(nom, option);
		return option;
	}
}

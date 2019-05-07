/**
 * 
 */
package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author KHARBECHE Bilel
 *
 */
public class Zone {

	/** animaux : liste des animaux */
	protected List<Animal> animaux = new ArrayList<>();

	/**
	 * Constructor
	 * 
	 */
	public Zone() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param animal
	 */
	public void addAnimal(Animal animal) {
		animaux.add(animal);
	}

	/**
	 * affiche la liste d'animaux
	 */
	public void afficherListeAnimaux() {
		for (Animal nom : animaux) {
			System.out.println(nom.getNom());
		}
	}

}

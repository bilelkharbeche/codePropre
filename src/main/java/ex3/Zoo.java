package ex3;

public class Zoo {

	/** savaneAfricaine : SavaneAfricaine */
	private SavaneAfricaine savaneAfricaine = new SavaneAfricaine();
	/** zoneCarnivore : ZoneCarnivore */
	private ZoneCarnivore zoneCarnivore = new ZoneCarnivore();
	/** fermeReptile : FermeReptile */
	private FermeReptile fermeReptile = new FermeReptile();
	/** aquarium : Aquarium */
	private Aquarium aquarium = new Aquarium();
	/** nom : nom du zoo */
	private String nom;

	/**
	 * Constructor
	 * 
	 * @param nom
	 */
	public Zoo(String nom) {
		this.nom = nom;
	}

	/**
	 * @param animal
	 *            permet d'ajouter un animal à la liste
	 */
	public void addAnimal(Animal animal) {
		if (animal.getType().equals("MAMMIFERE") && animal.getComportement().equals("CARNIVORE")) {
			zoneCarnivore.addAnimal(animal);
		} else if (animal.getType().equals("MAMMIFERE") && animal.getComportement().equals("HERBIVORE")) {
			savaneAfricaine.addAnimal(animal);
		} else if (animal.getType().equals("REPTILE")) {
			fermeReptile.addAnimal(animal);
		} else if (animal.getType().equals("POISSON")) {
			aquarium.addAnimal(animal);
		}
	}

	/**
	 * affiche la liste des animaux
	 */
	public void afficherListeAnimaux() {
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	public void calculerKgsNourritureParJour() {
		aquarium.calculerKgsNourritureParJour();
		fermeReptile.calculerKgsNourritureParJour();
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}

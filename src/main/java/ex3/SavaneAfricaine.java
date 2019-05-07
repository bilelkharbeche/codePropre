package ex3;

public class SavaneAfricaine extends Zone {

	/**
	 * @return le nombre d'animaux
	 */
	public int compterAnimaux() {
		return animaux.size();
	}

	/**
	 * @return le poids de nourriture par jour
	 */
	public int calculerKgsNourritureParJour() {
		return animaux.size() * 10;
	}
}

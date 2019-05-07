package ex3;

public class FermeReptile extends Zone {

	/**
	 * @return le nombre d'animaux
	 */
	public int compterAnimaux() {
		return animaux.size();
	}

	/**
	 * @return le poids de nourriture par jour
	 */
	public double calculerKgsNourritureParJour() {
		return animaux.size() * 0.1;
	}
}

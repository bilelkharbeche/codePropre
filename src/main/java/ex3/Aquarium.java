package ex3;

public class Aquarium extends Zone {

	/**
	 * @return le poids de nourriture par jour
	 */
	public double calculerKgsNourritureParJour() {
		return animaux.size() * 0.2;
	}
}

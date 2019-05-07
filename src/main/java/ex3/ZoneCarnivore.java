package ex3;

public class ZoneCarnivore extends Zone {
	/**
	 * @return la poids de nourriture par jour
	 */
	public double calculerKgsNourritureParJour() {
		return animaux.size() * 10;
	}
}

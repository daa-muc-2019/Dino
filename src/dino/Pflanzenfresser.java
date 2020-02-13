package dino;

public class Pflanzenfresser extends Dino {

	public Pflanzenfresser(int initHP, int initAP) {
		super("Herbivore", initHP, initAP);

	}

	@Override
	public void attack(Dino otherDino) {

		if (otherDino.getName() == this.getName()) {

			this.setHealthPoints(-1);

		}

	}

}

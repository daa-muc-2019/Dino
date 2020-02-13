package dino;

public class Fleischfresser extends Dino {

	private static final String NAME = "Carnivore";
	
	public Fleischfresser(int initHP, int initAP) {
		super(NAME, initHP, initAP);
	}
	
	 public Fleischfresser() {
		//this(1000, 1);
		super(NAME, 1000, 1);
	
	}

	@Override
	public void attack(Dino otherDino) {

		if (otherDino.getAttackPower() > this.getAttackPower()) {

			this.setHealthPoints(-otherDino.getAttackPower());

			// if(!this.isAlive())
			if (this.isAlive() == false) {

				otherDino.setHealthPoints(this.getAttackPower());

			}

		} else if (otherDino.getAttackPower() < this.getAttackPower()) {

			otherDino.setHealthPoints(-this.getAttackPower());

			// if(!this.isAlive())
			if (otherDino.isAlive() == false) {

				this.setHealthPoints(otherDino.getAttackPower());
		}

	}

	}
} 

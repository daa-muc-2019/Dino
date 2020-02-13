package dino;

abstract class Dino {

	private String name;
	private int healthPoints;
	private final int attackPower;

	public Dino(String initName, int initHP, int initAP) {

		this.name = initName;
		this.healthPoints = initHP;
		this.attackPower = initAP;

	}

	@Override
	public String toString() {
		return "Mein Name lautet: " + getName() + "\nIch besitze " + getHealthPoints() + "\n Meine Stärke ist: "
				+ getAttackPower();
	}

	public int getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(int addHealth) {
		this.healthPoints += addHealth;
	}

	public String getName() {
		return this.name;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public boolean isAlive() {
		if (healthPoints > 0) {
			return true;
		} else {
			return false;
		}

	}

	public abstract void attack(Dino otherDino);

}

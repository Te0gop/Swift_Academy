
public class Hero {
	
	private String name;
	private int lifePoints;
	private int power;
	private int energy;
	private int gold;
	private int progress;
	private final int MAX_LIFEPOINTS = 100;
	private final int MAX_ENERGY = 100;
    boolean hasCompletedLevel;
	
	public Hero (String name, int power) {
		this.name = name;
		this.lifePoints = MAX_LIFEPOINTS;
		this.energy = MAX_ENERGY;
		this.gold = 0;
		this.progress = 0;
		this.power = power;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLifePoints() {
		return lifePoints;
	}

	public void setLifePoints(int health) {
		lifePoints = health;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public int getProgress() {
		return progress;
	}

	public void setProgress(int progress) {
		this.progress = progress;
	}

	
	public void run() {
		if(energy > 0) {
			progress += 5;
			energy -= 5;
		} else {
			System.out.println("Can't run, not enough energy.");
		}

	}
	
	public void walk() {
		progress += 2;
	}
	
	public void stumble() {
		lifePoints -= 10;
		progress -= 2;
	}
	
	public void sleep(int moneyNeeded) {
		if ((gold-moneyNeeded) >= 0) {
			gold -= moneyNeeded;
			lifePoints = MAX_ENERGY;
			energy = MAX_ENERGY;
		} else {
			System.out.println("Not enough gold to sleep in pub.");
		}

	}
	public boolean hasCompletedLevel() {
		if (progress >= 100) {
			return true;
		} 
		return false;
	}

}

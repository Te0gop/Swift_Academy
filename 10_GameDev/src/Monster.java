
public class Monster {

	private int lifePoints;
	private int power;
	private int gift;
	
	
	public Monster(int power, int gift) {
		super();
		this.power = power;
		this.gift = gift;
		lifePoints = 30;
	}
	
	public int getLifePoints() {
		return lifePoints;
	}


	public void setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
	}


	public int getPower() {
		return power;
	}


	public void setPower(int power) {
		this.power = power;
	}


	public int getGift() {
		return gift;
	}


	public void setGift(int gift) {
		this.gift = gift;
	}
	
	public void attack(Hero hero) {
		
	while(hero.getLifePoints() > 0 && lifePoints > 0) {
		hero.setLifePoints(hero.getLifePoints() - power);
		lifePoints -= hero.getPower();
	}
	if(lifePoints <= 0) {
		hero.setGold(hero.getGold()+gift);
		} 
	
	}

	
}

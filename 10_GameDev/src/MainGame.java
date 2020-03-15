
public class MainGame {
	public static void main(String[] args) {
		
		Hero hero = new Hero("HERO", 10);
		
		Monster bear = new Monster(20, 30);
		Monster wolf = new Monster(10, 5);
		//Monster ant = new Monster(0, 5);
		
		int turn = 0;
		boolean isHeroDead = false;
		
		while(!(hero.hasCompletedLevel() || isHeroDead)) {
			turn++;
			
			hero.run();
			
			if(turn == 3 ) {
				bear.attack(hero);
			}
			if(turn == 10) {
				hero.sleep(10);
			}
			if(turn == 11) {
				hero.stumble();
			}
			if(turn == 12) {
				wolf.attack(hero);
			}
			if(hero.getLifePoints() <= 0) {
				isHeroDead = true;
			}
			

		}
		
		if (isHeroDead) {
			System.out.println("Game over"); 
		} else if(hero.hasCompletedLevel()) {
			System.out.printf("Bam bam bam! Fireworks and champagne! Completed in %d turns.", turn);
		}

		
		
		
		
	}
	
	
	
	
	

}

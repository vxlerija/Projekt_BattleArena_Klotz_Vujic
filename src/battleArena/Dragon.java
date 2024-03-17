package battleArena;

import java.util.concurrent.ThreadLocalRandom;

public class Dragon extends BaseCharacter {

	private int damagePoints;



	public Dragon(String name, int livingPoints) {
		super(name, livingPoints);
	}
	

	@Override
	public void getDamage(int Points) {	
		int damagePoints = ThreadLocalRandom.current().nextInt(5, 10 + 1);
		if(specialAbilityActive() == true) {
			this.setLivingPoints(getLivingPoints()- damagePoints);
		}
		
		
	}

	@Override
	public void attack(BaseCharacter enemy) {
		int points = ThreadLocalRandom.current().nextInt(20, 25 + 1);
		if(specialAbilityActive() == true) {
			points = points - ThreadLocalRandom.current().nextInt(5, 10 + 1);
		}
		enemy.getDamage(points);
			
		}
			

	@Override
	public boolean specialAbilityActive() {
	    if (!this.isSpecialAbility()) {
	        damagePoints = damagePoints - calculateMalus();
	        this.setLivingPoints(getLivingPoints()+10);
	        this.setSpecialAbility(true);
	        return true; 
	    } else {
	        System.out.println("Special ability is already active!");
	        return false; 
	    }
	}
	

	@Override
	public boolean specialAbilityDeactive() {
	    if (this.isSpecialAbility()) {
	        damagePoints = ThreadLocalRandom.current().nextInt(20, 25);
	        this.setLivingPoints(getLivingPoints()-10);
	        this.setSpecialAbility(false);
	        return true; 
	    } else {
	        System.out.println("Special ability is not active!");
	        return false; 
	    }
	}


	
	private int calculateMalus() {
		int malus = ThreadLocalRandom.current().nextInt(5,10);
		return malus;
	}
	
	
		
	
	
	
	

}

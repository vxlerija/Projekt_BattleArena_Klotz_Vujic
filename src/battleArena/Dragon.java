package battleArena;

import java.util.concurrent.ThreadLocalRandom;

public class Dragon extends BaseCharacter {

	private int damagePoints;



	public Dragon(String name, int livingPoints) {
		super(name, livingPoints);
		this.damagePoints = ThreadLocalRandom.current().nextInt(20,25);
	}
	

	@Override
	public void getDamage(int Points) {	
		int points = ThreadLocalRandom.current().nextInt(5, 10 + 1);
		if(specialAbilityActive() == true) {
			this.setLivingPoints(getLivingPoints()- points);
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
		if(!this.isSpecialAbility()==true) {
			int dmg = damagePoints - calculateMalus();
			int currentLivingPoints = this.getLivingPoints()+10;
			this.setSpecialAbility(true);
		} else {
			System.out.println("Special ability is already active!");
			return false;
		}
	}
	

	@Override
	public boolean specialAbilityDeactive() {
		if(!this.isSpecialAbility()==true) {
			damagePoints = ThreadLocalRandom.current().nextInt(20,25);
			int currentLifePoints = this.getLivingPoints()-10;
			this.setSpecialAbility(false);
		} else {
			System.out.println("Special ability is already active!");
		}
	}


	
	private int calculateMalus() {
		int malus = ThreadLocalRandom.current().nextInt(5,10);
		return malus;
	}
	
	
		
	
	
	
	

}

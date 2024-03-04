package battleArena;

import java.util.concurrent.ThreadLocalRandom;

public class Dragon extends BaseCharacter {

	public Dragon(String name, int livingPoints) {
		super(name, livingPoints, specialAbility);
		
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
		return false;
	}

	@Override
	public boolean specialAbilityDeactive() {
		return false;
	}
	
	 public void activateSpecialAbilityFly() {
		if(!this.isSpecialAbility()==true) {
			int dmg = attackDamage - calculateMalus();
			int currentLifePoints = this.getLifePoints()+10;
			this.setSpecialAbility(true);
		} else {
			System.out.println("Special ability is already active!");
		}
	}
	
	
	
	

}

package battleArena;

import java.util.concurrent.ThreadLocalRandom;

public class Dragon extends BaseCharacter {

	public Dragon(String name, int livingPoints) {
		super(name, livingPoints);
		
	}

	@Override
	public void getDamage(int Points) {	
		
	}

	@Override
	public void attack(BaseCharacter enemy) {
		int points = ThreadLocalRandom.current().nextInt(20, 25 + 1);
		enemy.setLivingPoints(getLivingPoints()-points);
			
		}
			

	@Override
	public boolean specialAbilityActive() {
		return false;
	}

	@Override
	public boolean specialAbilityDeactive() {
		return false;
	}
	
	
	
	

}

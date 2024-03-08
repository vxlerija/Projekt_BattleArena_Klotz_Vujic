package battleArena;

import java.util.concurrent.ThreadLocalRandom;

public class Dwarf extends BaseCharacter{

	public Dwarf(String name, int livingPoints) {
		super(name, livingPoints);
	}

	@Override
	public void getDamage(int points) {
	setLivingPoints(getLivingPoints() - points);
		
	}

	@Override
	public void attack(BaseCharacter enemy) {
		int points = ThreadLocalRandom.current().nextInt(15, 25 +1);
		enemy.getDamage(points);
	}

	@Override
	public boolean specialAbilityActive() {
		if(getLivingPoints() < 50) {
		}
		return true;
	}

	@Override
	public boolean specialAbilityDeactive() {
		return false;
	}
	
	public void specialAbility(int points) {
		int ranNumber = ThreadLocalRandom.current().nextInt(1, 10 + 1);
		if(getLivingPoints() <= 50 && getLivingPoints() > 20 && 1 <= ranNumber && ranNumber >= 3) {
			points = points*2;
		}else if(getLivingPoints() <= 20 && getLivingPoints() > 10 && 1 <= ranNumber && ranNumber >= 5) {
			points = points*2;
		}else if(getLivingPoints() <= 10 && getLivingPoints() > 0 && 1 <= ranNumber && ranNumber >= 7) {
			points = points*2;
		}else if(getLivingPoints() <= 50 && getLivingPoints() > 0 && 6 <= ranNumber && ranNumber >= 10) {
			points = points/2;
			}
		
	}
	
	
	
	
	

}

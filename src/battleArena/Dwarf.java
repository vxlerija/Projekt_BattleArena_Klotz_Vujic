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
		return false;
	}

	@Override
	public boolean specialAbilityDeactive() {
		return false;
	}
	
	
	
	
	
	

}

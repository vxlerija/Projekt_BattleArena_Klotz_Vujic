package battleArena;

import java.util.concurrent.ThreadLocalRandom;

public class Dragon extends BaseCharacter {

	public Dragon(String name, int livingPoints) {
		super(name, livingPoints);
		
	}

	@Override
	public void getDamage(int Points) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(BaseCharacter enemy) {
		ThreadLocalRandom.current().nextInt(20, 25 + 1);
		
	}

	@Override
	public boolean specialAbilityActive() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean specialAbilityDeactive() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	

}

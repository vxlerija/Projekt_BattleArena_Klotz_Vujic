package battleArena;
public abstract class BaseCharacter {
	
	private String name;
	protected int livingPoints;
	private boolean specialAbility;
	
	
	
	public BaseCharacter(String name) {
		super();
		this.name = name;
		this.livingPoints = 100;
		this.specialAbility =false;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLivingPoints() {
		return livingPoints;
	}
	
	
	public boolean isSpecialAbility() {
		return specialAbility;
	}
	public void setSpecialAbility(boolean specialAbility) {
		this.specialAbility = specialAbility;
	}
	
	public void setLivingPoints(int livingPoints) {
		if (this.livingPoints >= 0) {
			this.livingPoints = livingPoints;
		}else {
			this.livingPoints = 0;
		}
	}
	
	public abstract void getDamage(int points);
	
	public abstract void attack(BaseCharacter enemy);
	
	public abstract boolean specialAbilityActive();
	 
	public abstract boolean specialAbilityDeactive();
	
	
	

}

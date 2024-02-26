package battleArena;
public abstract class BaseCharacter {
	
	private String name;
	private int livingPoints;
	
	
	
	public BaseCharacter(String name, int livingPoints) {
		super();
		this.name = name;
		this.livingPoints = 100;
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
	public void setLivingPoints(int livingPoints) {
		this.livingPoints = livingPoints;
	}
	
	public abstract void getDamage(int Points);
	
	public abstract void attack(BaseCharacter enemy);
	
	public abstract boolean specialAbilityActive();
	 
	public abstract boolean specialAbilityDeactive();
	
	
	

}

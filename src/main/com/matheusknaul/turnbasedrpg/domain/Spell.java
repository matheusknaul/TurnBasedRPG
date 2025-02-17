package main.com.matheusknaul.turnbasedrpg.domain;

public class Spell {
	private Integer id;
	private String name;
	private String description;
	private int requiredLevel;
	private int requiredLucky;
	//Damages
	private double magicDamage;
	private double physicalDamage;
	private double elementalDamage;
	private double[] damage;
	
	public Spell(String name, String description, double magicDamage, double physicalDamage, double elementalDamage, int requiredLucky) {
		super();
		this.name = name;
		this.description = description;
		this.magicDamage = magicDamage;
		this.physicalDamage = physicalDamage;
		this.elementalDamage = elementalDamage;
		
		this.requiredLucky = requiredLucky;
		
		this.damage = new double[] {magicDamage, physicalDamage, elementalDamage};
	}

	public void displayStats() {
		System.out.print("Basic info of: '"+getName()+"': ");
		System.out.print("Required Level: "+ ((int) getRequiredLevel()) + " ");
		System.out.print("Description: " + getDescription());
		System.out.println();
		System.out.println("-=-=-=-=-=- end -=-=-=-=-=-");
	}
	
	public double[] useSpell(Entity entity, int lucky) {
		double chance = ((20.0 - getRequiredLucky()) / 20.0) * 100.0;
		System.out.println("Sua chance de acertar é: "+ chance + "%");
		if(lucky >= getRequiredLucky()) {
			System.out.println("Parabéns, você acertou a spell: "+ getName() + " em: " + entity.getName());
		}else {
			System.out.println("Infelizmente você errou!");
		}
		return this.damage;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getRequiredLevel() {
		return requiredLevel;
	}

	public void setRequiredLevel(int requiredLevel) {
		this.requiredLevel = requiredLevel;
	}

	public int getRequiredLucky() {
		return requiredLucky;
	}

	public void setRequiredLucky(int requiredLucky) {
		this.requiredLucky = requiredLucky;
	}

	public double getMagicDamage() {
		return magicDamage;
	}

	public void setMagicDamage(double magicDamage) {
		this.magicDamage = magicDamage;
	}

	public double getPhysicalDamage() {
		return physicalDamage;
	}

	public void setPhysicalDamage(double physicalDamage) {
		this.physicalDamage = physicalDamage;
	}

	public double getElementalDamage() {
		return elementalDamage;
	}

	public void setElementalDamage(double elementalDamage) {
		this.elementalDamage = elementalDamage;
	}
	
	
}

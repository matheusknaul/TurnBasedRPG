package main.com.matheusknaul.turnbasedrpg.domain;

public class Spell {
	private Integer id;
	private String name;
	private int requiredLevel;
	//Damages
	private double magicDamage;
	private double physicalDamage;
	private double elementalDamage;
	
	public Spell(String name, double magicDamage, double physicalDamage, double elementalDamage) {
		super();
		this.name = name;
		this.magicDamage = magicDamage;
		this.physicalDamage = physicalDamage;
		this.elementalDamage = elementalDamage;
	}

	public void displayStats() {
		System.out.print("Basic info of: '"+getName()+"': ");
		System.out.print("Required Level: "+ ((int) getRequiredLevel()) + " ");
		System.out.println();
		System.out.println("-=-=-=-=-=- end -=-=-=-=-=-");
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
	
	public int getRequiredLevel() {
		return requiredLevel;
	}

	public void setRequiredLevel(int requiredLevel) {
		this.requiredLevel = requiredLevel;
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

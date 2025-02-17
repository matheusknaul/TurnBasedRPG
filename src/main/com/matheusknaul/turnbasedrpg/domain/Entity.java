package main.com.matheusknaul.turnbasedrpg.domain;

import main.com.matheusknaul.turnbasedrpg.roles.EntityClass;

public class Entity {
	
	//Basic info
	
	private Integer id;
	private double life = 10.0;
	private String name;
	private double level = 1.0;
	private EntityClass entityClass;
	
	//Battle Attributes
	
	private double magicDamage = 0;
	private double physicalDamage = 5;
	private double elementalDamage = 0;
	private double attackSpeed = 0.25;
	private double criticalChance = 0.05;
	private double attackRange = 10;
	
	public Entity(Integer id, String name, EntityClass entityClass) {
		super();
		this.id = id;
		this.name = name;
		this.entityClass = entityClass;

	}
	
	public void displayStats() {
		System.out.print("Basic info of: '"+getName()+"': ");
		System.out.print("Level: "+ ((int) getLevel()) + " ");
		System.out.print("Life: "+ ((int) getLife()) + " ");
		System.out.print("Class: "+ getEntityClass().getName());
		System.out.println();
		System.out.println("-=-=-=-=-=- end -=-=-=-=-=-");
	}
	
	public double getLife() {
		return life;
	}
	public void setLife(double life) {
		this.life = life;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLevel() {
		return level;
	}
	public void setLevel(double level) {
		this.level = level;
	}
	public EntityClass getEntityClass() {
		return entityClass;
	}
	public void setEntityClass(EntityClass entityClass) {
		this.entityClass = entityClass;
	}
	
	
	
	
}

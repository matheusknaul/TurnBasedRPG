package main.com.matheusknaul.turnbasedrpg.itens;

import main.com.matheusknaul.turnbasedrpg.domain.Hability;
import main.com.matheusknaul.turnbasedrpg.domain.Spell;

public class Item {
	private String name;
	private int requiredLevel;
	
	private Hability passive;
	private Spell spell;
	
	public Item(String name, int requiredLevel, Hability passive, Spell spell) {
		super();
		this.name = name;
		this.requiredLevel = requiredLevel;
		this.passive = passive;
		this.spell = spell;
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

	public Hability getPassive() {
		return passive;
	}

	public void setPassive(Hability passive) {
		this.passive = passive;
	}

	public Spell getSpell() {
		return spell;
	}

	public void setSpell(Spell spell) {
		this.spell = spell;
	}
	
	
	
}

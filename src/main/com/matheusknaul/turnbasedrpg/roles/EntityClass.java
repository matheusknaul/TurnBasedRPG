package main.com.matheusknaul.turnbasedrpg.roles;

import java.util.ArrayList;

import main.com.matheusknaul.turnbasedrpg.domain.Spell;

public class EntityClass {
	private String name;
	private ArrayList<Spell> spells = new ArrayList<Spell>();

	public EntityClass(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public ArrayList<Spell> getSpells() {
		return spells;
	}

	public void setSpells(ArrayList<Spell> spells) {
		this.spells = spells;
	}
	
	
	
	
	
}

package main.com.matheusknaul.turnbasedrpg.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import main.com.matheusknaul.turnbasedrpg.itens.Resource;

public class Inventory {
	
	private int length = 40;
	private int countAmount;
	private Map<Resource, Integer> resources = new HashMap<>();
	
	public Inventory() {
		super();
	}
	
	public Inventory(Map<Resource, Integer> resources) {
		super();
		this.resources = resources;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public int getCountAmount() {
		return countAmount;
	}

	public void setCountAmount(int countAmount) {
		this.countAmount = countAmount;
	}

	public HashMap<Resource, Integer> getResources() {
		return resources;
	}

	public void setResources(ArrayList<Resource> resources) {
		this.resources = resources;
	}
	
	public void addResource(Resource resource, int amount) {
		if(amount > (getLength() - getCountAmount())) {
			System.out.println("Não foi possível adicionar esse item no inventário!");
		}else {
			System.out.println("Adicionado com sucesso!");
		}
	}
	
	
}
